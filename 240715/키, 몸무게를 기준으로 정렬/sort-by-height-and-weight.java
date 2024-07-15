import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Student  {
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            // Student 객체를 생성해 리스트에 추가합니다.
            students[i] = new Student(name, height, weight);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) {
                if(a.height != b.height){
                    return a.height - b.height;
                }

                return b.weight - a.weight;
            }
        });


         for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
        }
    }
}
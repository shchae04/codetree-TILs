import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            // Student 객체를 생성해 배열에 추가합니다.
            students[i] = new Student(name, height, weight);
        }

        // 이름 정렬
        Arrays.sort(students);

        // 이름 정렬 출력
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f\n", students[i].weight);
        }

        // 키 정렬
        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                return s2.height - s1.height;
            }
        });

        System.out.println();

        // 키 정렬 출력
        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f\n", students[i].weight);
        }
    }
}


class Student implements Comparable<Student> {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override //이름순으로 정렬
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
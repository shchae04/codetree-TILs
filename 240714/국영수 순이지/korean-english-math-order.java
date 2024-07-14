import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Student implements Comparable<Student> {
    String name;
    int kor,eng,math;

    public Student(String name,int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other) {
        // 국영수 우선 순위
        if(this.kor != other.kor){
            return other.kor - this.kor; // 국어 점수 내림차순
        }
        if(this.eng != other.eng){
            return other.eng - this.eng; // 영어 점수 내림차순
        }
        return other.math - this.math; // 수학 점수 내림차순
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
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name,kor,eng,math);
        }

        Arrays.sort(students);

        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].kor + " ");
            System.out.print(students[i].eng + " ");
            System.out.println(students[i].math);
        }
    }
}
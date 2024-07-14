import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i=0; i<n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            arr[i] = new Student(name, kor,eng, math);
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].kor + " ");
            System.out.print(arr[i].eng + " ");
            System.out.println(arr[i].math + " ");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor,eng,math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other){
        //총점이 낮은 순
        return (this.kor + this.math + this.eng) - (other.kor + other.math + other.eng);
        
    }
}
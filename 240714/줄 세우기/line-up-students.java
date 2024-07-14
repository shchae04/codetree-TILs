import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        int idx = 1;
        for(int i=0; i<n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Student(idx++, height, weight);
        }

        Arrays.sort(arr);

        // 정렬 이후 등수별 학생 번호 출력
        for(int i = 0; i < n; i++)
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].idx);
    }
}

class Student implements Comparable<Student> {
    int weight, height, idx;

    public Student(int idx, int height, int weight){
        this.idx = idx;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        if(this.height != other.height){//키가 다르면
            return other.height - this.height; // 키 내림차순
        }
        if(this.weight != other.weight){
            return other.weight - this.weight; // 몸무게 내림차순
        }
        return this.idx - other.idx; // 번호 오름차순
    }
}
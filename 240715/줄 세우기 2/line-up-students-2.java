import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] arr = new Student[n];
        for(int i=0; i<n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new Student(i+1,height, weight);
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i].height+" " +arr[i].weight +  " " + arr[i].idx);
        }
    }
}


class Student implements Comparable<Student>{
    int idx, height, weight;

    public Student(int idx, int height, int weight){
        this.idx = idx;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other){
        if(this.height != other.height){
            return this.height - other.height;
        }
        return this.weight - other.weight;
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //오름차순 정렬 시 각각의 위치에 있던 원소가 어느 위치로 이동하는지 출력하는 코드...
        ArrayList<Pos> position = new ArrayList<>();
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            position.add(new Pos(temp, i));
        }
        Collections.sort(position);

        //원소의 위치 배열에 저장
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[position.get(i).y] = i+1;
        }

        for(int i=0; i<n; i++){
            System.out.print(result[i] + " ");
        }

    }
}

class Pos implements Comparable<Pos>{
    int x,y;

    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos other){
        if(this.x != other.x){
            return this.x - other.x;  
        } 
        return this.y - other.y;
    }
}
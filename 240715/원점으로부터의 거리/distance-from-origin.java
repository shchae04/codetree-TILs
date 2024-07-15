import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pos> position = new ArrayList<>();
        for(int i =0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            position.add(new Pos(i+1,x,y));
        }

        Collections.sort(position);

        for(Pos pos : position){
            System.out.println(pos.idx);
        }
    }
}


class Pos implements Comparable<Pos>{
    int idx;
    int x;
    int y;
    int distance;

    public Pos(int idx,int x, int y){
        this.idx =idx;
        this.x = x;
        this.y = y;
        this.distance = Math.abs(x) + Math.abs(y);
    }

    @Override
    public int compareTo(Pos other){
        //좌표
        if(this.distance != other.distance){
            return this.distance - other.distance;
        }
        return this.idx - other.idx;
    }

}
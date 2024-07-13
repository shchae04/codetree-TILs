import java.util.Scanner;

class Agent {
    String cName;
    int val;

    public Agent() {
        this.cName = "";
        this.val = 0;
    }

    public Agent(String cName, int val){
        this.cName = cName;
        this.val = val;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Agent[] agent = new Agent[5];
        int temp = 0;
        for(int i = 0; i < 5; i++) {
            String cName = sc.next();
            int val = sc.nextInt();

            if(temp == 0){
                temp = val;
            } else if(val < temp){
                temp = val;
            }
            agent[i] = new Agent(cName,val);
        }

        for(int i=0; i<5; i++){
            if(agent[i].val == temp){
                System.out.print(agent[i].cName + " " + agent[i].val);
                return;
            }
        }
    }
}
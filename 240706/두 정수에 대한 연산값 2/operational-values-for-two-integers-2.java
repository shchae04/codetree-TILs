import java.util.Scanner;

public class Main {    
    
    public static void calc(IntegerWrap a, IntegerWrap b) {
        if(a.getValue() > b.getValue()){  
            a.setValue(a.getValue() * 2);
            b.setValue(b.getValue() + 10);
        } else {
            a.setValue(a.getValue() + 10);
            b.setValue(b.getValue() * 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerWrap A = new IntegerWrap(a);
        IntegerWrap B = new IntegerWrap(b);
        calc(A,B);
        a = A.getValue();
        b = B.getValue();

        System.out.println(a + " " + b);
    }
}

class IntegerWrap {
    private int value;

    public IntegerWrap(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
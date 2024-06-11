public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 1;
        int b = 2;
        int c = 3;

        int temp = a;
        int temp2 = b;
        int temp3 = c;
        a = a+b+c;
        b = temp + temp2 + c;
        c = temp + temp2 + temp3;

        System.out.println(a + " " + b + " " + c);
    }
}
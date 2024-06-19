public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                // 짝수일 때와 19단의 마지막 배수일 때 줄을 바꿈
                if (j % 2 == 0 || j == 19) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                } else {
                    System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                }
            }
        }
    }
}
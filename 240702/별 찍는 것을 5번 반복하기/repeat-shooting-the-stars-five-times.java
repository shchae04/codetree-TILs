public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        for(int i=0; i<5; i++){
            printStar2();
        }


        
    }
    public static void printStar2(){
            for(int i=0; i<1; i++){
                for(int j=0; j<10; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
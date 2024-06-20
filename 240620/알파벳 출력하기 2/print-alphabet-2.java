import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char cChar = 'A';

        for(int i=0; i<n; i++){
            
            for(int k=0; k<i ; k++){
                System.out.print("  ");
            }

            for(int j=0; j<n-i; j++){
                System.out.print(cChar + " ");
                cChar++;
                if(cChar > 'Z'){
                    cChar = 'A';
                }
            }
            System.out.println();
        }
    }
}
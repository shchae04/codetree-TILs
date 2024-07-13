import java.util.Scanner;
class Product {
    String name;
    String code;

    public Product(){
        this.name = "";
        this.code = "";
    }
    public Product(String name, String code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Product product = new Product("codetree","50");
        System.out.printf("product %s is %s\n",product.code, product.name);

        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        String code =sc.next();
        Product product1 = new Product(name,code);
        System.out.printf("product %s is %s",product1.code, product1.name);



        
    }
}
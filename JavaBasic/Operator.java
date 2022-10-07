import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Value a");
        int a=sc.nextInt();
        System.out.println("Enter Value b");
        int b=sc.nextInt();

        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
        System.out.println("Thanks");


        int e=100,w=400;
        boolean q=(e==w);
        System.out.println("100 = 400 is "+q);

    }
    
}

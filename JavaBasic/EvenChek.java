import java.util.Scanner;
public class EvenChek {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=kk.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("End program");
    
    }
    
}

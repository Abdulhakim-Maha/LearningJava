import java.util.Scanner;
public class OddOrEven {
 public static void main(String[] args) {
     Scanner dd = new Scanner(System.in);
     System.out.println("Enter your number to check ");
     int num = dd.nextInt();
     if(num%2==0) System.out.println("Even");
     else System.out.println("Odd");
     
 }   
}

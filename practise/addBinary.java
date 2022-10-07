import java.util.Scanner;
public class addBinary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter binary number1 : ");
        String b1 = input.next();
        System.out.print("Enter binary number2 : ");
        String b2 = input.next();

        int binary1 = Integer.parseInt(b1,2);
        int binary2 = Integer.parseInt(b2,2);

        System.out.println(Integer.toBinaryString(binary1*binary2));


    }
    
}

import java.util.Scanner;
public class binaryToHex extends Binarytodecimal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Binarytodecimal meth = new Binarytodecimal();
        System.out.print("Enter binary : ");
        int binary = input.nextInt();
        char[] hex ={'0','1','3','2','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexString ="";
        int mod;

        while(binary>0){
            mod = binary%10000;
            int index = meth.bintode(mod);
            hexString = hex[index]+hexString;
            binary/=10000;
        }
        System.out.println(hexString);
    }
}

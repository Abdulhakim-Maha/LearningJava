import java.util.Scanner;
public class Hextodec extends Binarytodecimal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hexdecimal : ");
        String hexInput = input.next();
        int i=0,j=0;
        String binary ="";

        
        while(i<hexInput.length()){
            binary = binary+hextoBi.changeData(hexInput.charAt(i++));
        }
        int binaryInt =Integer.parseInt(binary);
        Binarytodecimal btd = new Binarytodecimal();
        System.out.println(btd.bintode(binaryInt));
    

        
    }
}

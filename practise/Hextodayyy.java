import java.util.Scanner;
public class Hextodayyy {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Ente hex :");
        char[] hex =input.next().toCharArray();
        String binary ="";
        for(int i=0;i<hex.length;i++){
            binary = binary+hextoBi.changeData(hex[i]);
        }
        System.out.println(binary);
    
    }    
}

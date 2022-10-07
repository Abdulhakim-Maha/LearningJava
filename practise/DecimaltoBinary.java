import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter decimal :");
      int decimal = input.nextInt();
      char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
      String hexString ="";  
      int hexmod ;

      while(decimal>0){
          hexmod=decimal%16;
          hexString = hex[hexmod] +hexString;
          decimal=decimal/16;
      }
      System.out.println(hexString);


      
    }
}

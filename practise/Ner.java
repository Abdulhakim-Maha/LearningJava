import java.util.Scanner;
public class Ner {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter binary number : ");
      int b1 = input.nextInt();
      System.out.print("Enter binay number : ");
      int b2 = input.nextInt();
      int[] sum = new int[20];
      int i=0, remainder=0; 

      while(b1!=0 || b2!=0){
            sum[i++] = (b1%10 + b2%10 + remainder)%2;
            remainder = (b1%10 + b2%10 + remainder)/2;
            b1/=10;
            b2/=10;
      }
      --i;
      if(remainder>0) System.out.print(remainder);
     
      while(i>=0){
          System.out.print(sum[i]);
          i--;
      }
      System.out.println();

       
    


    }
    
}

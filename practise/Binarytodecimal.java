import java.util.Scanner;
public class Binarytodecimal {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter binary : ");
      int binary = input.nextInt();
       int binaryMod,i=0,sum=0,multi=0;
      
       while(binary>0){
            binaryMod = binary%10;
            multi = binaryMod*(int)Math.pow(2, i++);
            sum =sum+multi; 
            binary/=10;
      }
      System.out.println(sum);
  }


  public int bintode(int bin){
    int binMod,multi=0,sum=0,i=0;
    //System.out.print(bin);  
    while(bin>0){
        binMod = bin%10;
        multi = binMod*(int)Math.pow(2, i++);
        sum =sum+multi; 
        bin/=10;
       } 
    return sum;
  }
}

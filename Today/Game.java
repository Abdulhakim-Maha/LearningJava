import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        for(int i=0;i<number;i++){
            for(int y=0;y<=i;y++){
                System.out.print("x");
            }
            for(int y=number;y>i;y--){
                System.out.print(" ");
            }
            
            for(int y=number;y>i;y--){
               System.out.print(" ");
           }
           for(int y=0;y<=i;y++){
               System.out.print("x");
           }
           System.out.println();
        }
        for(int i=0;i<=number*2+1;i++) System.out.print("x");
        System.out.println();
        for(int i=0;i<number;i++){
            for(int y=number;y>i;y--){
                System.out.print("x");
            }
            for(int y=0;y<=i;y++){
                System.out.print(" ");
            }
            for(int y=0;y<=i;y++){
               System.out.print(" ");
           }
            for(int y=number;y>i;y--){
               System.out.print("x");
           }
           
           System.out.println();
        }
    }
}
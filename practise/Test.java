import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = input.nextInt();
        System.out.print("Enter second number : ");
        int n2 = input.nextInt();
        int compare = Integer.valueOf(n1).compareTo(Integer.valueOf(n2));

        if(compare!=0)System.out.println(n1+" is unequal to "+n2);
        if(compare<0) System.out.println(n1+" is less than "+n2);
        else System.out.println(n1+" is greater than "+n2);
       
    }
    
}

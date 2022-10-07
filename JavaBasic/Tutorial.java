import java.util.Scanner;
public class Tutorial {
    public static void main(String[] args) {

    Scanner dd=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=dd.nextLine();
    System.out.println("Your name is "+name);

    System.out.println("Enter your age ");
    int age=dd.nextInt();
    System.out.print("Your age is "+age);
    }
    
}

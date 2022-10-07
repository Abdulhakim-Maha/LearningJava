import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        b1.setName(input.nextLine());
        System.out.print("Enter your age : ");
        b1.setAge(input.nextInt());
        System.out.print("Enter your weighy(pounds) : ");
        b1.setWeight(input.nextDouble());
        System.out.print("Enter your height(feet) : ");
        b1.setFeet(input.nextDouble());
        System.out.print("Enter your height(inches) : ");
        b1.setInches(input.nextDouble());
        System.out.println("Your BMI is "+b1.calculateBMI());
        b1.display();
    }
}

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter your weight(kg) ");
        float w = ss.nextFloat();
        System.out.println("Enter your height(cm) ");
        float h = ss.nextFloat();
        h/=100;
        float bmi = w/(h*h);
        System.out.println("Your bmi is = "+bmi);
    }
    
}

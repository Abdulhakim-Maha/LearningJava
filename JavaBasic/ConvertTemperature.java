import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter Temperature(Fahrenheit) ");
        float temp = dd.nextFloat();
        temp = (temp - 32) *(5.0f/9.0f);
        System.out.println("Temperature in Celcius is "+temp +" Celcius");
    }
    
}

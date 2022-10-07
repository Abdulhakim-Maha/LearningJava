import java.util.Scanner;
public class SwitchCase 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
        int month =sc.nextInt();
        String name ="";
        switch (month) {
            case 1:
                name ="mokkarakom";
                break;
            case 2:
                name ="kumphapan";
                break;
            case 3:
                name ="minakom";
                break;
            default:     
                name ="other";
        }
        System.out.println(name);
    }
}
import java.util.Scanner;
public class secTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter second time: ");
        int second = input.nextInt();

        int sec = second%60;
        second/=60;
        int min = second%60;
        second/=60;
        System.out.println(second+":"+min+":"+sec);
    }   
}

import java.util.Scanner;
public class ToLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.println(str.toLowerCase());
    }
}

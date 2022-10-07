import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String to reverse: ");
        String str = input.nextLine();
        System.out.println(reverse(str));
    } 
    static String reverse(String str){
        String reString ="";
        for(int i=str.length()-1;i>=0;i--){
            reString = reString+str.charAt(i);
        }
        return reString;
    }
}

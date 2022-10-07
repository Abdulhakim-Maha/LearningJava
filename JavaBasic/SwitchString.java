import java.util.Scanner;
public class SwitchString {
    public static void main(String[] args) {
        Scanner ff = new Scanner(System.in);
        System.out.println("Your emotion!");
        String emotion = ff.nextLine();
        String tex ="";
        switch (emotion) {
            case "love":
                tex = "saranghae!";
                break;
            case "angry":
                tex = "wae!";
                break;
            case "happy":
                tex = "yeapposeo!";
                break;
            default:
                tex ="orasseo!";
        }
        System.out.println(tex);
    }
    
}

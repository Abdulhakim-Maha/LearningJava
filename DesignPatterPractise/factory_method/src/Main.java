import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Log log;
        Creator creator = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which language to print supposed to be: ");
        String input = scanner.next();

        if (input.equals("NodeJs")) {
            creator = new LogInNodeJs();
        } else if (input.equals("Python")) {
            creator = new LogInPython();
        } else if (input.equals("Php")) {
            creator = new LogInPhp();
        }
        creator.printToScreen();

    }
}
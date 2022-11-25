package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

import java.util.Scanner;

public class AllInOne {
    static private GUIFactory guiFactory;
    static private Button button;
    static private Checkbox checkbox;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your os: ");
        String input = scanner.next();
        if (input.equals("mac")){
          guiFactory = new MacOSFactory();
        }
        else if (input.equals("windows")){
            guiFactory = new WindowsFactory();
        }
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
        button.paint();
        checkbox.paint();

    }
}

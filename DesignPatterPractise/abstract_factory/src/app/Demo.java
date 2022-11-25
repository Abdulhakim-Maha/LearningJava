package app;


import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Application application = configurationApplication();
        application.paint();
    }
    private static Application configurationApplication(){
        Application app;
        GUIFactory guiFactory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your os: ");
        String input = scanner.nextLine();
        if (input.equals("mac")){
           guiFactory = new MacOSFactory();
        }else if (input.equals("windows")){
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        return app;
    }
}

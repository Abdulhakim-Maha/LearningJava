package app;

import factories.ComputerAbstractFactory;
import factories.PCFactory;
import factories.ServerFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Application application = getApp();
        application.print();
    }
    public static Application getApp(){
        Application app;
        ComputerAbstractFactory abstractFactory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your type: ");
        String input = scanner.next();
        if(input.equals("pc")){
            abstractFactory = new PCFactory("16","512","ryzen");
        }else if(input.equals("server")){
            abstractFactory = new ServerFactory("64","1024","x-10");
        }
        app = new Application(abstractFactory);
        return app;
    }
}
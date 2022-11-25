package app;

import computer.Computer;
import factories.ComputerAbstractFactory;

public class Application {
    private Computer computer;

    public Application(ComputerAbstractFactory abstractFactory) {
        this.computer = abstractFactory.createComputer();
    }

    public void print(){
        System.out.println(computer.toString());
    }


}

public class Main {
    public static void main(String[] args) {
//        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder("512","16");
//        computerBuilder.setBluetoothEnabled(true).setGraphicalCardEnabled(true);


        Computer com1 = new Computer.ComputerBuilder("512","16").setBluetoothEnabled(true).setGraphicalCardEnabled(true).build();
        System.out.println(com1);
    }
}
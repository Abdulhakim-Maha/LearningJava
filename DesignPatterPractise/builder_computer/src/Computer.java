public class Computer {

    //required parameters
    private String HDD;
    private String RAM;
    //optional parameters
    private boolean isGraphicalCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicalCardEnabled = builder.isGraphicalCardEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    @Override
    public String toString() {
        return "Computer{" + "HDD='" + HDD + '\'' + ", RAM='" + RAM + '\'' + ", isGraphicalCardEnabled=" + isGraphicalCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + '}';
    }

    public String getRAM() {
        return RAM;
    }

    public static class ComputerBuilder {
        //required parameters
        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicalCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicalCardEnabled(boolean isGraphicalCardEnabled) {
            this.isGraphicalCardEnabled = isGraphicalCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}

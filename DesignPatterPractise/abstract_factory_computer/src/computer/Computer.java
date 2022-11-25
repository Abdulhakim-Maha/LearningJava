package computer;

public abstract class Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Computer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM: " + getRAM() + "\nHDD: " + getHDD() + "\nCPU: " + getCPU() + "\n";
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }
}

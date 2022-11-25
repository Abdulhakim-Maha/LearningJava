package computer;

public class PC extends Computer{
    public PC(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }

    @Override
    public String getRAM() {
        return super.getRam();
    }

    @Override
    public String getHDD() {
        return super.getHdd();
    }

    @Override
    public String getCPU() {
        return super.getCpu();
    }
}

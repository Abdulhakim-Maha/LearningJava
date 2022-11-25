package computer;

public class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
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

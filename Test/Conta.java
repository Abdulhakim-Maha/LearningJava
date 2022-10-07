public class Conta{
    //Attribute
    private String name;
    private int number;

    public Conta(){
        this("austiniqer",5);
    }
    public Conta(String name){
        this.name=name;
    }
    public Conta(String name, int number){
        this.name=name;
        this.number=number;
    }

    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
}
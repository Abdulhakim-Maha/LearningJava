public abstract class Game {
    
    //Attribute
    private int no;
    private String name;
    private boolean status;

    //Constructor
    public Game(){
        System.out.println("Hello World!");
    }
    public Game(String nama,int number){
        System.out.println("Your name is = "+nama +"\nNumber = "+number);
    }

    //method 
    public void setNo(int no){
        this.no=no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStatus(boolean status){
        this.status=status;
    }


    //abstract 
    public abstract void skill(String skill);

    //display 
    public void display(){
        System.out.println(this.no);
        System.out.println(this.name);
        System.out.println(this.status);
    }
}   





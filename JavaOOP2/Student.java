public abstract class Student {
    
    //Attribute
    private String id;
    private String name;


    //method
    public abstract void register();
    public abstract void preTest();
    public abstract void postTest();

    //setID
    public void setID(String id){
        this.id=id;
    }

    //setName
    public void setName(String name){
        this.name=name;
    }
    
    //display
    public void display(){
        System.out.println("No "+this.id);
        System.out.println("Name "+this.name);
    }


}

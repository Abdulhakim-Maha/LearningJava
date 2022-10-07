public class Staff extends Employee{
    //Attribute
    private String title;
    
    //Contructor
    public Staff(){
        super();
    }
    public Staff(String title){
        this.title=title;
    }

    //setter 
    public void setTitle(String title){
        this.title=title;
    }
    //getter
    public String getTitle(){
        return this.title;
    }
    @Override
    public String toString() {
        return super.toString()+"Title : "+title+"\n";
    }
}

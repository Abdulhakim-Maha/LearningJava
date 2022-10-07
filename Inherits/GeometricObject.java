import java.util.Date;

public class GeometricObject{
    //Attribute 
    private String color="red";
    private boolean filled;
    private Date dateCreated;

    //Constructor
    public GeometricObject(){
        dateCreated =new Date();
        System.out.println("This is superclass contructor");
    }
    public GeometricObject(String color, boolean filled){
        dateCreated=new Date();
        this.color=color;
        this.filled=filled;
        System.out.println("This is superclass contructor");
    }
    //getter 
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    //setter
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    //methods
    public Date getDateCreated(){
       return this.dateCreated;
    }
    // @Override
    // public String toString() {
    //     return "Created on"+dateCreated 
    //            +"\nColor : "+color;
               
    // }
}
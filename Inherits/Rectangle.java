public class Rectangle extends GeometricObject{
    //Attribute
    private double width;
    private double height;
    
    //Contructor
    public Rectangle(){
        // super();
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width=width;
        this.height=height;
    }
    //getter
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }   

    //setter
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    //methods
    public void printRectangle(){
         System.out.print("Created circle on "+getDateCreated()
        +"\nColor : "+getColor()
        +"\nHeight : "+getHeight()
        +"\nWidth : "+getWidth()
        +"\nArea : "+getArea()
        +"\nPerimeter : "+getPerimeter());       
    }
    
}

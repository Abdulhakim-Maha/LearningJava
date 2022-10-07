public class Circle extends GeometricObject{
    //Attribute
    private double radius;
    
    //Constructor
    public Circle(){
        // super();
    }
    public Circle(double radius){
        // super();
        this.radius=radius;
    }
    public Circle(double radius, String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    //getter
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    //setter
    public void setRadius(double radius){
        this.radius=radius;
    }
    //methods
    public void printCircle(){
        System.out.print("Created circle on "+getDateCreated()
                          +"\nColor : "+getColor()
                          +"\nRadius : "+getRadius()
                          +"\nArea : "+getArea()
                          +"\nDiameter : "+getDiameter()
                          +"\nPerimeter : "+getPerimeter());            
    }
}

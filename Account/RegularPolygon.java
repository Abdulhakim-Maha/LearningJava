public class RegularPolygon{
    //Attribute
    private int n =3;  // number of side
    private double side =1.0; // lenght of side
    private double x =0.0;  // x-coordinate
    private double y =0.0;  // y-coordinate

    //Contructor
    public RegularPolygon(){
        //default
    }
    public RegularPolygon(int n, double side){
        this.n=n;
        this.side=side;
    }
    public RegularPolygon(int n, double side, double x, double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    //Setter or Mutator methods
    public void setN(int n){
        this.n=n;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    
    //Getter or Accessor methods
    public int  getN(){
        return this.n;
    }
    public double setSide(){
        return this.side;
    }
    public double setX(){
        return this.x;
    }
    public double setY(){
        return this.y;
    }

    //methods 
    public double getPerimeter(){
        return n*side;
    }
    public double gerArea(){
        return (n*Math.pow(side, 2))/4*Math.tan(Math.PI/n);
    }

    



}
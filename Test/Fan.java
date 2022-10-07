public class Fan{
    // attribute 
    final int SLOW = 1;
    final int MEDIUM = 2; 
    final int HIGH = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    public String color ="blue";

    
        

    //mutator methods
    public void setSpeed(int speed){this.speed=speed;}
    public void setOn(boolean on){this.on=on;}
    public void setRadius(double radius){this.radius=radius;}
    public void setColor(String color){this.color=color;}
    //accessor
    public int getSpeed(){return this.speed;}
    public boolean getOn(){return this.on;}
    public double getRadius(){return this.radius;}
    public String getColor(){return this.color;}
    //Contructor
    
    public Fan(){

    }
    public Fan(int speed, double radius,String color){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
    }
    
    @Override
    public String toString() {
        if(this.on==true){
            return this.getSpeed()+" " +this.getRadius()+" "+this.getColor();
        }
        else return "fan is off";
    }
   
}
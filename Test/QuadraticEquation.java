public class QuadraticEquation{
    private double a,b,c;
    //contructor
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    //accessor
    public double getA(){return this.a;}
    public double getB(){return this.b;}
    public double getC(){return this.c;}
    //methods
    public double getdiscriminant(){
        return Math.pow(b, 2)-4*a*c;
    }
    public double getRoot1(){
        if(getdiscriminant()>=0) {
            return (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        }
        else return 0;
    }
    public double getRoot2(){
        if(getdiscriminant()>=0) {
            return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        }
        else return 0;
    }
}
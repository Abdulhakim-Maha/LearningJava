public class BMI{
    //Attribute
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double height;

    //Constuctor
    public BMI(String name, int age, double weight, double feet, double inches){
        this.name=name;
        this.age=age;
        this.weight=weight*0.45359237;
        this.height=(feet*0.3048)+(inches*0.0254);
    }
    public BMI(){

    }

    //setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight*0.45359237;
    }
    public void setInches(double inches){
        this.inches=inches* 0.0254;
    }
    public void setFeet(double feet){
        this.feet=feet*0.3048;
    }

    //getter methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double height(){
        return this.feet+this.inches;
    }
    //methods
    public double calculateBMI(){
        return weight/Math.pow(height(), 2); 
    }
    public void display(){
        System.out.println("Your name is "+this.name
                             +"\nYour age is "+this.age
                             +"\nYour height is "+this.height);
        if(calculateBMI()>=30.) System.out.println("Obese");
        else if(calculateBMI()>=25.0) System.out.println("Overweight");
        else if(calculateBMI()>=18.5) System.out.println("Normal");
        else System.out.println("Underweigh");
    }
}
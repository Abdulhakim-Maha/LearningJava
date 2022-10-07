public class BMI{
        //Attribute
        private String name;
        private int age;
        private double weight;
        private double feet;
        private double inches;
        private double bmi;

        //Constuctor
        public BMI(String name, int age, double weight, double feet, double inches){
            this.name=name;
            this.age=age;
            this.weight=weight*0.45359237;
            this.feet=feet;
            this.inches=inches*0.0254;
        }
        public double calculateBMI(){
            return bmi=weight/Math.pow(inches, 2); 
        }
        public void display(){
            System.out.println("Your name is "+this.name
                                 +"\nYour age is "+this.age);
            if(bmi>=30.) System.out.println("Obese");
            else if(bmi>=25.0) System.out.println("Overweight");
            else if(bmi>=18.5) System.out.println("Normal");
            else System.out.println("Underweigh");
        }
}
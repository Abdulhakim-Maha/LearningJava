public class Person {
    //Attribute
    int i=7;

    
    public Person(){
        // System.out.println("Person default contructor");
        setI(20);
        System.out.println("i from A is "+i);
    }
    public Person(int y){
        System.out.println("Person 1's contructor");
    }
    public String getInfo(){
        return "Person";
    }
    public void printPerson(){
        System.out.println(getInfo());
    }

    public void setI(int i){
        this.i=2*i;
    }
}

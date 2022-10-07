class Employee {
    //Attribute   
    private String id;
    private String name;
    private double salary;
    private String status;
    private int no;
    private String province;
    
    //Static Attribute
    static int minSalary =10000;

    //Constructor1
    public Employee(String id, String name, double salary,String status){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.status=status;
        displayEmployee();
    }
    //Constructor2
    public Employee(int no, String province ){
        this.no=no;
        this.province=province;
        dis2();
    }

    //default constructor
    public Employee(){
        // System.out.println("I'm progammer!");
        // System.out.println("Nice to meet you!");
    }


    //Static method
    static void title(){
        System.out.println("samsamtech");
    }
    
    
    //setter Method
    public void setID(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    //display
    public void displayEmployee(){
        System.out.println("ID = "+this.id);
        System.out.println("NAME = "+this.name);
        System.out.println("SALARY = "+this.salary);
        System.out.println("Status = "+this.status);
    }
    //display 2
    public void dis2(){
        System.out.println("Your number is ="+this.no);
        System.out.println("Your province is "+this.province);
    }


    //getter method
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
}

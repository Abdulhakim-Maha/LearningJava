import java.util.Date;
public class Employee extends Person{
    //Attribute
    private String office;
    private double salary;
    private Date dateHire;

    //contructor
    public Employee(){
        super();
        dateHire = new Date();
    }
    public Employee(String name, String address, String phoneNumber, String emailAddress){
        super(name,address,phoneNumber,emailAddress);
        dateHire = new Date();
    }
    public Employee(String name, String address, String phoneNumber, String emailAddress,String office,double salary){
        super(name,address,phoneNumber,emailAddress);
        dateHire = new Date();
        this.office=office;
        this.salary=salary;
    }
    public Employee(String office, double salary){
        super();
        dateHire = new Date();
        this.office = office;
        this.salary= salary;
    }

    //setter
    public void setOffice(String office){
        this.office=office;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    //getter
    public String getOffice(){
        return this.office;
    }
    public double getSalary(){
        return this.salary;
    }
    public Date getDate(){
        return this.dateHire;
    }
    @Override
    public String toString() {
        return super.toString()+"Office : "+office +"\nSalary : "+salary+"\nDate hired : "+dateHire+"\n";
    }
}

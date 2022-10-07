import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name,address,phoneNumber,emailAddress,office,title;
    int status,rank,select;
    double officeHours,salary;
    do{
        System.out.println("select from following"
        +"\nPerson  : 1"
        +"\nStudent : 2"
        +"\nEmployee: 3"
        +"\nFaculty : 4"
        +"\nStaff   : 5"
        +"\nExit    : 6\n");
        System.out.print("please select number: ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.print("Name : ");
                name=input.nextLine();
                name=input.nextLine();
                System.out.print("Address : ");
                address=input.nextLine();
                System.out.print("Phone number : ");
                phoneNumber=input.nextLine();
                System.out.print("Email address : ");
                emailAddress=input.nextLine();
                Person a =new Person(name,address,phoneNumber,emailAddress);
                System.out.println("\nPerson"+a.toString());
                break;
            case 2:
                System.out.print("Name : ");
                name=input.nextLine();
                name=input.nextLine();
                System.out.print("Address : ");
                address=input.nextLine();
                System.out.print("Phone number : ");
                phoneNumber=input.nextLine();
                System.out.print("Email address : ");
                emailAddress=input.nextLine();
                System.out.print("Status : ");
                status=input.nextInt();
                Student b =new Student(name,address,phoneNumber,emailAddress,status);
                System.out.println("\nStudent"+b.toString());
                break;
            case 3:
                System.out.print("Name : ");
                name=input.nextLine();
                name=input.nextLine();
                System.out.print("Address : ");
                address=input.nextLine();
                System.out.print("Phone number : ");
                phoneNumber=input.nextLine();
                System.out.print("Email address : ");
                emailAddress=input.nextLine();
                System.out.print("Office : ");
                office=input.nextLine();
                System.out.print("Salary : ");
                salary=input.nextDouble();
                Employee c =new Employee(name,address,phoneNumber,emailAddress,office,salary);
                System.out.println("\nEmployee"+c.toString());
                break;
            case 4:
                System.out.print("Name : ");
                name=input.nextLine();
                name=input.nextLine();
                System.out.print("Address : ");
                address=input.nextLine();
                System.out.print("Phone number : ");
                phoneNumber=input.nextLine();
                System.out.print("Email address : ");
                emailAddress=input.nextLine();
                System.out.print("Office : ");
                office=input.nextLine();
                System.out.print("Salary : ");
                salary=input.nextDouble();
                System.out.print("Office Hours : ");
                officeHours=input.nextDouble();
                System.out.print("Rank : ");
                rank=input.nextInt();
                Faculty d =new Faculty(officeHours,rank);
                d.setName(name);
                d.setAddress(address);
                d.setPhoneNumber(phoneNumber);
                d.setEmailAddress(emailAddress);
                d.setOffice(office);
                d.setSalary(salary);
                System.out.println("\nFaculty"+d.toString());
                break;
            case 5:
                System.out.print("Name : ");
                name=input.nextLine();
                name=input.nextLine();
                System.out.print("Address : ");
                address=input.nextLine();
                System.out.print("Phone number : ");
                phoneNumber=input.nextLine();
                System.out.print("Email address : ");
                emailAddress=input.nextLine();
                System.out.print("Office : ");
                office=input.nextLine();
                System.out.print("Salary : ");
                salary=input.nextDouble();
                System.out.print("Title : ");
                title=input.nextLine();
                title=input.nextLine();
                Staff e =new Staff(title);
                e.setName(name);
                e.setAddress(address);
                e.setPhoneNumber(phoneNumber);
                e.setEmailAddress(emailAddress);
                e.setOffice(office);
                e.setSalary(salary);
                System.out.println("\nStaff"+e.toString());
                break;
            case 6:
                System.out.println("\nProgram has been exit\n");
        }
    }while(!(select==6));   
    }
}

public class Main {
    public static void main(String [] args){

        /*Employee E1 = new Employee();//Create Object
        E1.setID("10-8-55");
        E1.setName("bea-suzy");
        E1.setSalary(60000);

        Employee E2 = new Employee();//Create Object
        E2.setID("10-8-56");
        E2.setName("nam-do-san");
        E2.setSalary(70000);
       
        E1.displayEmployee();
        System.out.println();
        E2.displayEmployee();
        System.out.println(""+E1.getName());
        System.out.println(""+E2.getName());
        System.out.println(""+E1.getID());
        System.out.println(E1.getSalary());*/

        //Employee b1=new Employee("63011075","austiniqer",1000000.0);
        //b1.displayEmployee();
        //int result = Employee.minSalary;
        //System.out.println(result);

        //System.out.println(Company.nama);
        //System.out.println(Company.x);

        //Employee.title();
      
      /* Scanner kk= new Scanner(System.in);
        Programmer jj = new Programmer();
        String name = kk.nextLine();
        System.out.println();
        jj.setID("2222");
        jj.setSalary(1000.0);
        jj.setName(name);
        jj.displayEmployee();*/

        Programmer kim = new Programmer("10","hakim",16000,"Single");
        kim.skill("C","Java");
        System.out.println();
        
        Programmer min = new Programmer();
        min.skill("C","C++","Swift","java","R");


        
    }
}

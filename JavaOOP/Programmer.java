public class Programmer extends Employee{
    public Programmer(String id,String name,double salary,String status){
        super(id,name,salary,status); 
    }
    public Programmer(){

    }
    public void skill(){
        System.out.println("I have no skill!");
    }
    public void skill(String...language){
        for(int i=0;i<language.length;i++) System.out.println("My skill is "+language[i]);
    }
    
}

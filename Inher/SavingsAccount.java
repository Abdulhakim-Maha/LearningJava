public class SavingsAccount extends Account{
    
    //constructor
    public SavingsAccount(){
        super();
    }
    public SavingsAccount(int id, double balance){
        super(id, balance);
    }    
    public void setSmth(){
        System.out.print("this method has only in savingaccount");
    }
   
}
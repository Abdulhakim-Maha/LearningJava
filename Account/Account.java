import java.util.Date;

public class Account {
    //Attribute
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //Constructor
    public Account(){
       // Date currentTime = new Date();
        this.dateCreated=new Date();
        //default
    }
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
        //Date currentTime = new Date();
        this.dateCreated=new Date();
    }

    //Setter methods or Mutator
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate/100;
    }
    
    //Getter method or Accessor
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }


    //method 
    public double getMonthlyInterestRate(){   
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double withdraw){
        this.balance-=withdraw;
        //  System.out.print("You have withdrawn amount of "+withdraw+" Bath\n");
        //  System.out.println("Your balance is "+this.balance+" Bath");
    }
    public void deposit(double deposit){
        this.balance+=deposit;
        //  System.out.print("You have deposited amount of "+deposit+" Bath\n");
        //  System.out.println("Your balance is "+this.balance+" Bath");
    }
    

}
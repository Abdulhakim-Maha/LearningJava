import java.util.Date;
import java.util.Scanner;
public class Account{
    //Attribute
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    Scanner input = new Scanner(System.in);
    
    //contructor
    public Account(){
        this.dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
        this.dateCreated = new Date();
    }

    //accessor methods
    public int getID(){
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
    //mutator methods
    public void setID(int id){
         this.id=id;
    }
    public void setBalance(double balance){
         this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
         this.annualInterestRate=annualInterestRate/100;
    }
    
    //methods
    public double getMounthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    public double getMounthlyInterest(){
        return balance*getMounthlyInterestRate();
    }
    public void withdraw(double withdraw){
        if(withdraw>balance || withdraw<0){
            do{
                System.out.println("\namount of money can not be negative\nand cannot more than balance");
                System.out.print("\nEnter amount of money: ");
                withdraw = input.nextDouble();
            }while(!(withdraw<balance && withdraw>0));
            this.balance=balance-withdraw;
            System.out.println("You have withdrawn"+withdraw +"\nYour balance is "+balance);
        }
        else{
            this.balance=balance-withdraw;
            System.out.println("You have withdrawn:"+withdraw +"\nYour balance is "+balance);
        }
    }
    public void deposit(double deposit){
        if(deposit<0){
            do{
                System.out.println("\namount of money can not be negative");
                System.out.print("\nEnter amount of money: ");
                deposit = input.nextDouble();
            }while(!(deposit>0));
            this.balance+=deposit;
            System.out.println("You have deposited:"+deposit +"\nYour balance is "+balance);
        }
        else{
            this.balance+=deposit;
            System.out.println("You have deposited"+deposit +"\nYour balance is "+balance);
        }
        
    }

    
}
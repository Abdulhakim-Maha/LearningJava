import java.util.Date;
import java.util.Scanner;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    //constructor
    public Account(){
        dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
    }

    //accessor
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreate(){
        return this.dateCreated;
    }

    //mutator
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    Scanner input = new Scanner(System.in);
    //methods
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterest(); 
    }
    public void withdraw(){
        double withdraw;
        boolean correct=false;
        do{
            System.out.print("Enter amount of money to withdraw: ");
            withdraw = input.nextDouble();
            if((withdraw<=balance) && (withdraw>0)){
                correct=true;
            }
            else{
                System.out.println("amount of money cannot be negative or more than balance");
            }

        }while(!correct);
        balance-=withdraw;
        System.out.println("You have withdrawn: "+withdraw+"\nYour balance is : "+balance);
    }
    public void deposit(){
        double deposit;
        boolean correct=false;
        do{
            System.out.print("Enter amount of money to deposit: ");
            deposit= input.nextDouble();
            if(deposit>0){
                correct=true;
            }else{
                System.out.println("amount of money cannot be negative");
            }
        }while(!correct);
        balance+=deposit;
        System.out.println("You have deposited: "+deposit+"\nYour balance is : "+balance);
    }
}

import java.util.ArrayList;
import java.util.*;
public class NewAccount {
    //Attribute
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions;

    //contructor
    public NewAccount(){

    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public NewAccount(String name, int id, double balance){
        this.balance=balance;
        this.id=id;
        this.name=name;
    }
    public void deposit(double amount){
        this.balance -= amount;
        transactions.add(new Transaction('D', amount, balance,"Deposit cash"));
    }   
    public ArrayList<Transaction> getTransaction(){
        return transactions;
    }
}
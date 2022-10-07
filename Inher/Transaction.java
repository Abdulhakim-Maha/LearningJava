import java.util.Date;
public class Transaction {
    //Attribute
    private Date date;
    private char type;

    private double amount;
    private double balance;
    private String description;

    //constructor
    public Transaction(){
        date = new Date();
    }
    public Transaction(char type, double amount, double balance, String description){
        date = new Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }
    @Override
     public String toString(){
        return "type : " + this.type + " amount = " + this.amount + " balance = " + this.balance + " description : " + this.description + " date : " + this.date+"\n";
    }
}

public class CheckingAccount extends Account{
    //attribute
    private double overdraftlimit;
    //constructor
    public CheckingAccount(){
        super();
    }
    public CheckingAccount(int id, double balance, double overdraftlimit){
        super(id,balance);
        this.overdraftlimit=overdraftlimit;
    }
    public CheckingAccount(int id, double balance){
        super(id,balance);
    }
    //mutator
    public void setOverdraftlimit(double overdraftlimit){
        this.overdraftlimit=overdraftlimit;
    }
    //accessor
    public double getOverdraftlimit(){
        return overdraftlimit;
    }

    @Override
    public void withdraw() {
        double withdraw;
        boolean correct=false;
        do{
            System.out.print("Enter amount of money to withdraw: ");
            withdraw = input.nextDouble();
            if((withdraw>0) && (getBalance()-withdraw <= overdraftlimit)){
                correct=true;
            }
            else{
                System.out.println("cannot withdraw more than limit || cannot be negative");
            }

        }while(!correct);
        setBalance(getBalance()-withdraw);
        System.out.println("You have withdrawn: "+withdraw+"\nYour balance is : "+getBalance());
    }
}
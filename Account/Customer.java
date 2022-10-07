public class Customer{
    public static void main(String[] args) {
        Account ac1 =  new Account(1122,20000.0);
        ac1.setAnnualInterestRate(4.5);
        ac1.withdraw(2500.0);
        ac1.deposit(3000.0);
        System.out.println();
        System.out.println("Your balance is "+ac1.getBalance()+" Bath");
        System.out.println("MounthlyInterest is "+ac1.getMonthlyInterest());
        System.out.println("This account was created on "+ac1.getDateCreated());
        System.out.println();
    }
}

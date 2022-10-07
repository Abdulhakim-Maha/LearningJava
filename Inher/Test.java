import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Account c1 = new Account(10,5000);
        // c1.setAnnualInterestRate(4.5);
        // c1.deposit();
        // System.out.println();
        // c1.withdraw();
        // System.out.println();
        // SavingsAccount n1 = new SavingsAccount(10,500);
        // n1.withdraw();
        // CheckingAccount n2 = new CheckingAccount(10,500,-500);
        // System.out.println("Your balance: "+n2.getBalance());
        // n2.withdraw();
        // Account n = new SavingsAccount();
        // if(n instanceof SavingsAccount){
        //     System.out.print(n);
        // }
        // if(n instanceof Object){
        //     System.out.println(n);
        // }
        // Account n1 = new Account();
        // if(n1 instanceof SavingsAccount){
        //     System.out.println("n1 is instanceof SavingsAccount");
        // }else{
        //     System.out.println("n1 is not instanceof SavingsAccount");
        // }
        // Account a = new SavingsAccount();
        // ((SavingsAccount)a).setSmth();
        // Account b  = new Account();
        // SavingsAccount c = (SavingsAccount)b;
        // Object d= new Object();
        // SavingsAccount q = (SavingsAccount)d;
            // SavingsAccount n = new SavingsAccount();
            // n.deposit();
        CheckingAccount n = new CheckingAccount();
        System.out.println("Checking");
        System.out.print("Overdraft Limit: ");
        n.setOverdraftlimit(input.nextDouble());
        System.out.print("Balance : ");
        n.setBalance(input.nextDouble());
        // System.out.println(n.getBalance());
        n.withdraw();
        

  

    }
}

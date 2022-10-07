import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NewAccount n = new NewAccount();
        System.out.print("Name :");
        n.setName(input.nextLine());
        System.out.print("Account Id :");
        n.setId(input.nextInt());
        System.out.print("Annual interest rate :");
        n.setAnnualInterestRate(input.nextDouble());
        System.out.print("Balance :");
        n.setBalance(input.nextDouble());
        n.deposit(300);
        n.deposit(6000);
        System.out.print(n.getTransaction());
        
        
    }
}

import java.util.Scanner;
public class Cash {
    public static void main(String[] args) {
        Scanner ii = new Scanner(System.in);
        System.out.println("Enter your money");
        int money=ii.nextInt();
        System.out.println("Your money is "+money);
        if(money>=1000)
        {
            System.out.println(" 1000 = "+(money/1000)+" cash");
            money%=1000;
        }
        if(money>=500)
        {
            System.out.println(" 500 = "+(money/500)+" cash");
            money%=500;
        }
        if(money>=100)
        {
            System.out.println(" 100 = "+(money/100)+" cash");
            money%=100;
        }
        if(money>=50)
        {
            System.out.println(" 50 = "+(money/50)+" cash");
            money%=50;
        }
         if(money>=20)
        {
            System.out.println(" 20 = "+(money/20)+" cash");
            money%=20;
        }
        if(money>=10)
        {
            System.out.println(" 10 = "+(money/10)+" cash");
            money%=10;
        }
        if(money>=5)
        {
            System.out.println(" 5 = "+(money/5)+" cash");
            money%=5;
        }
        if(money>=1)
        {
            System.out.println(" 1 = "+(money/1)+" coins");
        }
    }
}

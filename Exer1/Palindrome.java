public class Palindrome {
    public static void main(String[] args) {
        int counter =0;
        int start =2;
        while(counter<100){
            if(isPalindrome(start) && isPrime(start)){
                System.out.print(start+" ");
                counter++;
                if(counter%10==0) System.out.println();
            }
            start++;
        }
    }

    public static boolean isPalindrome(int num){
        int sum=0,temp;
        temp=num;
        while(num>0){
            sum=(sum*10)+num%10;
            num/=10;
        }       
        if(temp==sum) return true;
        else return false;
    }

    public static boolean isPrime(int x) {
        if (x % 2 == 0 && x != 2) {
            return false;
        }
        int sqr = (int)Math.sqrt(x);
        for (int i = 3; i <= sqr; i += 2) {
            if(x % i == 0) {
                return false;
             }
         }
         return true;
    }
}

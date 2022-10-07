public class Multiple {
    public static void main(String[] args) {
        multiple(10,50,700);
    }

    static void multiple(long...number){
        long sum=0;
        for(int i=0;i<number.length;i++)
        {
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
    
}
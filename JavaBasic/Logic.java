public class Logic {
    public static void main(String[] args) {
        int a=20,b=30;
        boolean s=(a==b);
        System.out.println(s);
        a+=10;
        boolean q=(a==b);
        System.out.println(q);
        
        System.out.println(s&&q);
        System.out.println(s||q);
    }
    
}

public class Test {
    public static void main(String[] args) {
        String s =new String("Wel");
        Object o =s;
        String d = (String)o;
        if(o==s){
            System.out.println("yes"+o.toString()+" "+s.toString());
        }
    }
}
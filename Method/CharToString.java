public class CharToString {
    public static void main(String[] args) {
        // char[] name ={'a','u','s','t','i','n'};
        // String na = String.copyValueOf(name);
        // System.out.println(na);
        // System.out.println(na.length());


        String a = "   austiiqer    ";
        //System.out.println(a);
        a = a.trim();
        System.out.println(a);
        a = a.toUpperCase();
        System.out.println(a);
        a = a.toLowerCase();
        System.out.println(a);

        int num = 100;
        String result = String.valueOf(num);
        String t = "100";
        int resul = Integer.parseInt(t);
        System.out.println(resul);
        

        
    }
    
}

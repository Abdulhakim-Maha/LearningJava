public class CharacterMethod {
    public static void main(String[] args) {
        String name1="austiniqer";
        String name2="AusTiniQer";

        boolean True = name1.equalsIgnoreCase(name2);
        System.out.println(True);

        boolean Check = name1.startsWith("u");
        System.out.println(Check);

        String a = "Happy New year 2020";
        a = a.replace("2020","2021");
        System.out.println(a);
        

        
    }
}

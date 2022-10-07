public class Method implements Method1{ 
    public static void main(String[] args) {
        
        displayNumber("austiniqer");
        fullname("Abdulhakim", "Maha");
    }

    static void displayNumber(String messsage) {
        System.out.println("Your name is "+messsage);   
    }
    
    static void fullname(String fistname, String lastname){
        System.out.println("First name is "+fistname +" Last name is "+lastname);
    }
}

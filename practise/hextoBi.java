import java.util.Scanner;
public class hextoBi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hex : ");
        String hex = input.next();
        int i=0;
        String Binary ="";
        
        while(i<hex.length()){
            //System.out.println(hex.charAt(i++));
            Binary = Binary+changeData(hex.charAt(i++));   
        } 
        System.out.println(Binary);





    }
    public static String changeData(char hex){
        String  bi="";   
        switch(hex){
            case  '1':
                bi="0001"; 
                break;
            case  '2':
                bi="0010"; 
                break;
            case  '3':
                bi="0011"; 
                break;
            case  '4':
                bi="0100"; 
                break; 
            case  '5':
                bi="0101"; 
                break; 
            case  '6':
                bi="0110"; 
                break; 
            case  '7':
                bi="0111"; 
                break; 
            case  '8':
                bi="1000"; 
                break; 
            case  '9':
                bi="1001"; 
                break; 
            case  'A':
                bi="1010"; 
                break; 
            case  'B':
                bi="1011"; 
                break; 
            case  'C':
                bi="1100"; 
                break;  
            case  'D':
                bi="1101"; 
                break; 
            case  'E':
                bi="1110"; 
                break; 
            case  'F':
                bi="1111"; 
                break;                   
        }
        return bi;
    } 

}

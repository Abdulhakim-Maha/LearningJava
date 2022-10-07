import java.util.Scanner;
class CutRepeat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        char[] name=input.nextLine().toCharArray();
        for(int i=1;i<name.length;i++){
            for(int y=i-1;y>=0;y--){
                if(name[i]==name[y]){
                    for(int j=i+1;j<name.length;j++,i++){
                        name[i]=name[j];
                        name[j]=' ';                       
                    }                                                           
                }
            }
        }
        for(char a : name){
            System.out.print(a);
        }
    }
}
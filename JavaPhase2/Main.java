import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        
        
        //Object
         //Mario kim = new Mario();

        // kim.setNo(10);
        // kim.setName("hakim");
        // kim.setStatus(true);
        // kim.display();
        // kim.skill("jumping");
        // kim.setAbility("high");
        // plus();
        // Scanner jj= new Scanner(System.in);
        // System.out.println("Enter your name ");
        // String ff =jj.nextLine();
        // String name = name(ff);
        // System.out.println(name);
        // int Max=maxValue(1100, 10000);
        // System.out.println(Max);
        String[] name ={"seoyeji","pakdongchol","baesuzy","oidongook","namjuhyuk"};
        display(name);
        



       

        
    }



    static void plus(){
        System.out.println("10 + 5 = "+(10+5));
    }

    static String name(String NAME){
        NAME = "Your name is " +NAME +"\nNice to meet you";
        return NAME;
    }
    static int maxValue(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static void display(String [] arr){
        System.out.print("{");
        for(int i = 0;i<arr.length;i++){
            System.out.print("name is "+arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.print("}");

    }

}
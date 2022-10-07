public class Main {
    public static void main(String[] args) {
        
        // int[] number={85,55,3,1,5,4,84,454,245,21,44,1,2,44,2}; 
        // // display(number);
        // // System.out.println();
        // int[] number1=bubleSort(number);
        String[] fruit={"apple","banana","watermelon"};
        System.out.println(searchString(fruit, "durian"));
        
        // display(number);
        // System.out.println();
        // display(number1);
        // System.out.println();
        // System.out.println(searchElemet(number, 44));
       
        // int[] b={10,22,56,70,52,3}; 
        // int min = MinValue(number);
        // System.out.println(min);
        // System.out.println();
        // int max = MaxValue(number);
        // System.out.println(max);
        // boolean result = compare(number, b);
        // System.out.println(result);





    }
    public static int MinValue(int [] number){
        
        int min=number[0];
        for(int i=0;i<number.length;i++){
           if(number[i]<min){
               min = number[i];
            }
        }
        return min;
    }
    public static int MaxValue(int [] number){
        int max=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max = number[i];
             }
         }
         return max;
    }
    public static boolean compare(int [] a,int [] b){
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true ;
    } 
    public static int[] bubleSort(int [] a){
        int[] b =a;
        display(b);
        int temp;
        for(int i=0;i<b.length;i++){
            for(int j=1;j<b.length-i;j++){
                if(b[j-1]>b[j])
                {
                    temp = b[j-1];
                    b[j-1]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println();
        display(a);
        return b;
    }
    
    static void display(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.print("}");
    }

    static int searchElemet(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    static int searchString(String[] arr,String fruit){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(fruit)){
                return i;
            }
        }
        return -1;
    }
}

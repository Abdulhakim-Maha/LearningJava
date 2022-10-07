class E2{
    public static void main(String[] args) {
        int count=1,count1=1,count2=1;
        System.out.println("divided by 3 is ");
        while(count<=100){
            if(count%3==0) System.out.print(count+" ");
            count++;
        }
        System.out.println("\ndivided by 5 is ");
        while(count1<=100){
            if(count1%5==0) System.out.print(count1+" ");
            count1++;
        }
        System.out.println("\ndivided by 3 and 5 is ");
        while(count2<=100){
            if((count2%5==0)&&(count2%3==0)) System.out.print(count2+" ");
            count2++;
        }
    }
}
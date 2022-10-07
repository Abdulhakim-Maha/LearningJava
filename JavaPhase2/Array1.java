class Array1{
    public static void main(String[] args) {
    
    int[] num={1,2,3,4,5};
    //for(int i=0;i<5;i++) System.out.println(num[i]);
    //String[] cast={"seoyeji","namdosan","beasuzy","namjuri","kwonnara"};
    //for(int j=0;j<5;j++) System.out.println(cast[j]);//for loop
    //System.out.println(cast.length);
     
   /* for(String data : cast){    //for each
        System.out.println(data);
    }*/
    int sum1=0;
    for(int sum : num) {
        sum1+=sum;
        System.out.println(sum1);
    }
    }
}
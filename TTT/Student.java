public class Student extends Person {
    //Attribute 
    private int status;
    // private String[] Strstatus={"freshman","sophomore","junior","senior"};

    //contructor
    public Student(){
        super();
    }
    public Student(String name, String address, String phoneNumber, String emailAddress){
        super(name,address,phoneNumber,emailAddress);
    }
    public Student(String name, String address, String phoneNumber, String emailAddress, int status){
        super(name,address,phoneNumber,emailAddress);
        this.status=status;
    }
    public Student(int status){
        this.status=status;
    }

    //setter
    // public void setStatus(int status){
    //     this.status=status;
    // }
    //getter
    public String getStatus(){
       if(status==1){
           return "freshman";
       }
       else if(status ==2){
           return "sophomor";
       }
       else if(status ==3){
           return "junior";
       }
        else {
            return "senior";
       }   
    }
   @Override
   public String toString() {
       return super.toString()+"Status : "+getStatus()+"\n";
   }

}

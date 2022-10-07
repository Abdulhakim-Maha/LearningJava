public class Person {
    //Attribute
    private String name, address, phoneNumber, emailAddress;

    //constructor
    public Person(){
       
    }
    public Person(String name, String address, String phoneNumber, String emailAddress){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmailAddress(){
       return this.emailAddress;
    }
    @Override
    public String toString(){
        return "\nName : "+name+"\nAddress : "+address+"\nPhone number : "+phoneNumber+"\nEmail Address : "+emailAddress+"\n";
    }
}

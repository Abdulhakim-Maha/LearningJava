public class Mario extends Game {
   
    //Atribute
    private String ability; 
    
    //Contructor
    public Mario(String name,int number){
        super(name,number);
        //System.out.println("Annyong!");
    }
    public Mario(){
        super();
    }
    
    
    
    //method
    public  void skill(String skill){
        System.out.println("Skill = "+skill);
    }
    public void setAbility(String ability){
        this.ability=ability;
        System.out.println(this.ability);
    }

}

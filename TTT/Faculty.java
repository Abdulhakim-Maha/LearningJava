public class Faculty extends Employee {
    //Attribute
    private double officeHours;
    private int rank;

    //contructor
    public Faculty(){
        super();
    }
    public Faculty(double officeHours){
        super();
        this.officeHours=officeHours;
    }
    public Faculty(int rank){
        super();
        this.rank=rank;
    }
    public Faculty(double officeHours, int rank){
        this.officeHours=officeHours;
        this.rank=rank;
    }
    //setter
    public void setOfficeHours(double officeHours){this.officeHours=officeHours;}
    public void setRank(int rank){this.rank=rank;}
    //getter
    public double getOfficeHours(){
        return this.officeHours;
    }
    public int getRank(){
        return this.rank;
    }
    @Override
    public String toString() {  
        return super.toString()+"Office Hours : "+officeHours +"\nRank : " +rank+"\n";
    }
    
}

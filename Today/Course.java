public class Course{
    //Attribute
    private String courseName;
    private String[] student = new String[100];
    private int numberOfStudent;

    //Contructor
    public Course(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void addStudent(String student){
        this.student[numberOfStudent]=student;
        numberOfStudent++;
    }
    public String[] getStudents(){
        return this.student;
    }
    public int getNumberOfStudents(){
        return this.numberOfStudent;
    }
    public void clear(){

    }
    public void dropStudent(){
        
    }
}
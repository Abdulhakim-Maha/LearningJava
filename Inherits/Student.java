public class Student extends Person {
  public Student(int y){
    // super(y);
    // System.out.println("Student contructor");
    System.out.println("i from B is "+i);
  }
  @Override
  public String getInfo() {
      return "Student";
  }
  
  public void setI(int i) {
    this.i=3*i;
  }
}

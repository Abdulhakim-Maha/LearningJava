import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course c1 = new Course("Data Structure");
        System.out.print("Add student: ");
        for(int i=0;i<3;i++){
            c1.addStudent(input.nextLine());
        }
        System.out.println("Number of students in course1: "+ c1.getNumberOfStudents());
        String[] students = c1.getStudents();
        for (int i = 0; i < c1.getNumberOfStudents(); i++)
        System.out.print(students[i] + ", ");   
         
    }
}

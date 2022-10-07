import java.io.File;
public class FileTest{
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/iker.gif");
        System.out.print("Does file exist? "+file.exists());
    }
}
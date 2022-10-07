import java.util.Scanner;
public class Hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int radius = input.nextInt();
        double AreaofHexagon = (6 * Math.pow(radius, 2)/(4*Math.tan(Math.PI/6)));
        System.out.println(AreaofHexagon);

    }    
}

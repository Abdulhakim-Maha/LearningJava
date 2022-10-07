import java.util.Scanner;
public class CalculatePolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of polygon: ");
        int side = input.nextInt();
        System.out.print("Enter radius of polygon: ");
        int radius = input.nextInt();

        double area =(side*Math.pow(radius, 2))/(4*Math.tan(Math.PI/side)); 
        System.out.println(area);

    }
}

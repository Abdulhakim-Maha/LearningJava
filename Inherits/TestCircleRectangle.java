public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle c1 = new Circle(15,"black",true);
        c1.printCircle();
        System.out.println("\n");
        Rectangle r1 = new Rectangle("pink",true,15,20);
        r1.printRectangle();
        // System.out.println("\n"+r1);
    }
}

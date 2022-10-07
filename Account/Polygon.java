public class Polygon {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        rp1.setN(3);
        rp1.setSide(2);
        rp1.setX(5.6);
        rp1.setY(7.8);
        System.out.println("\nPerimeter = "+rp1.getPerimeter());
        System.out.println("Area = "+rp1.gerArea()+"\n");
        
        RegularPolygon rp2 = new RegularPolygon(6,4);
        System.out.println("Perimeter = "+rp2.getPerimeter());
        System.out.println("Area = "+rp2.gerArea()+"\n");
        
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter = "+rp3.getPerimeter());
        System.out.println("Area = "+rp3.gerArea()+"\n");
       
        
    }
}

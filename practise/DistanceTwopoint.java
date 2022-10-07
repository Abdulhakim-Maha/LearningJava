import java.util.Scanner;
public class DistanceTwopoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lattitude coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Enter longitude coordinate 1: ");
        double long1 = input.nextDouble();
        System.out.print("Enter lattitude coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Enter longitude coordinate 2: ");
        double long2 = input.nextDouble();
        System.out.println(distanceBetweentopoint(lat1, long1, lat2, long2));


    }

    static double distanceBetweentopoint(double lat1,double long1,double lat2,double long2){
        double distance=0,earthRadius = 6371.01;
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);
        return  distance = earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2));
    }

    
}

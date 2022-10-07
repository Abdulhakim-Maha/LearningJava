public class While {
    public static void main(String[] args) {
        int count=1;
        while (true) {
            System.out.println("round "+count+" nam do san");
            count++;
            if (count>100) break;
        }
    }
    
}

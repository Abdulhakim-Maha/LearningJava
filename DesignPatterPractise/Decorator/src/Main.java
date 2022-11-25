public class Main {
    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Incredients : " + pizza.getDescriptoin());
        System.out.println("Price : " + pizza.getCost());
    }
}
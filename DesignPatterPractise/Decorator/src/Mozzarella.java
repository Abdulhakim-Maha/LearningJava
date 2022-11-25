public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza wrapper) {
        super(wrapper);
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescriptoin() {
        return wrapper.getDescriptoin() + ", mozzarella";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Moz:" + .50);
        return wrapper.getCost() + .50;
    }
}

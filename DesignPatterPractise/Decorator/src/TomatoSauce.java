public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza wrapper) {
        super(wrapper);
        System.out.println("Adding sauce");
    }

    @Override
    public String getDescriptoin() {
        return wrapper.getDescriptoin() + ", tomato sauce";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of sauce" + .35);
        return wrapper.getCost() + .35;
    }
}

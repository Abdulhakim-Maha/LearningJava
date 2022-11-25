public class ToppingDecorator implements Pizza {

    protected Pizza wrapper;

    public ToppingDecorator(Pizza wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String getDescriptoin() {
        return wrapper.getDescriptoin();
    }

    @Override
    public double getCost() {
        return wrapper.getCost();
    }
}

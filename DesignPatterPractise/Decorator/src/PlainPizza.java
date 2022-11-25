public class PlainPizza implements Pizza{
    @Override
    public String getDescriptoin() {
        return "this dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}

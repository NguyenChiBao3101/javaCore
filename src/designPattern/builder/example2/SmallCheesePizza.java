package designPattern.builder.example2;

public class SmallCheesePizza extends VegPizza{
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 170.0f;
    }
}

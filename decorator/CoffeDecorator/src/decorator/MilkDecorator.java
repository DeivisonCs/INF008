package decorator;

import model.Coffee;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return super.decoratedCoffee.getDescription() + " with Milk";
    }
}

package decorator;

import model.Coffee;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return super.decoratedCoffee.getDescription() + " with Sugar";
    }
}

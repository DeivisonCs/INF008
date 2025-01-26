package decorator;

import model.Coffee;

public class ChocolateDecorator extends CoffeeDecorator{

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.decoratedCoffee.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.decoratedCoffee.getDescription() + " with Chocolate";
    }
}

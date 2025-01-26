package decorator;

import model.Coffee;

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public Double getCost() {
        return this.decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }

}

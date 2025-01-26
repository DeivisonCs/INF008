package model;

public class SimpleCoffee implements Coffee{

    @Override
    public Double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffe";
    }
    
    @Override
    public String toString() {
        return this.getDescription() + " | Cost: " + this.getCost();
    }
}

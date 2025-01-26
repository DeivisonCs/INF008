package model;

public class ExpressoCoffee implements Coffee{

    @Override
    public Double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Expresso Coffe";
    } 

    @Override
    public String toString() {
        return this.getDescription() + " | Cost: " + this.getCost();
    }
}

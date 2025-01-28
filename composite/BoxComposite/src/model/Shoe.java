package model;

public class Shoe extends Product{

    public Shoe(String name, Double price) {
        super(name, price);
    }

    @Override
    public void show() {
        System.out.println(super.getName());
    }

}

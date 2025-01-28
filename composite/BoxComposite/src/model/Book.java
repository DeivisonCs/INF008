package model;

public class Book extends Product{

    public Book(String name, Double price) {
        super(name, price);
    }

    @Override
    public void show() {
        System.out.println(super.getName());
    }

}

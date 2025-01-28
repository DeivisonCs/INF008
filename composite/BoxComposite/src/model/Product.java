package model;

public abstract class Product implements Box{
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void addProduct(Box product) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Double calculatePrice() {
       return this.price;
    }

    @Override
    public abstract void show();

    public String getName() {
        return name;
    }

}

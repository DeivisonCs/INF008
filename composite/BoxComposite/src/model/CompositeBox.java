package model;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box{
    private List<Box> products;

    public CompositeBox(){
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Box product) {
        this.products.add(product);
    }

    @Override
    public Double calculatePrice() {
        return products.stream().mapToDouble(Box::calculatePrice).sum();
    }

    @Override
    public void show() {
        this.products.stream().forEach(Box::show);
    }

}

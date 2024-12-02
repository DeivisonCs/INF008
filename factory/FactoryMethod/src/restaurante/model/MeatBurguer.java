package restaurante.model;

public class MeatBurguer implements Burguer{

    @Override
    public void prepare() {
        System.out.println("Preparing Meat Burguer");
    }

}

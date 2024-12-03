package restaurante.model;

public class ChickenBurguer extends Burguer{

    @Override
    public void prepare() {
        this.setMeat("Chicken");
        System.out.println("Preparing " + this.getMeat() + " Burguer");
    }

}

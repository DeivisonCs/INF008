package restaurante.model;

public class MeatBurguer extends Burguer{

    @Override
    public void prepare() {
        this.setMeat("meat");
        System.out.println("Preparing " + this.getMeat() + " Burguer");
    }

}

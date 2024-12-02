package restaurante.model;

public class ChickenBurguer implements Burguer{

    @Override
    public void prepare() {
        System.out.println("Preparing Chiken Burguer");
    }

}

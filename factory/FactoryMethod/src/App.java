
import restaurante.factory.ChickenBurguerFactory;
import restaurante.factory.MeatBurguerFactory;
import restaurante.factory.Restaurante;
import restaurante.model.Burguer;

public class App {
    public void run1(){
        Restaurante chickenRestaurant = new ChickenBurguerFactory();
        Restaurante meatRestaurant = new MeatBurguerFactory();

        Burguer chickenBurguer = chickenRestaurant.orderBurguer();
        Burguer meatBurguer = meatRestaurant.orderBurguer();
    }

    public static void main(String[] args) throws Exception {
        (new App()).run1();
    }
}

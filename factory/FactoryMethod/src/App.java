
import restaurante.factory.ChickenBurguerFactory;
import restaurante.factory.MeatBurguerFactory;
import restaurante.factory.Restaurante;
import restaurante.model.Burguer;
import techShop.factory.AsusFactory;
import techShop.factory.MsiFactory;
import techShop.factory.Shop;
import techShop.model.gpu.Gpu;
import techShop.model.monitor.Monitor;

public class App {
    public void restauranteExample(){
        Restaurante chickenRestaurant = new ChickenBurguerFactory();
        Restaurante meatRestaurant = new MeatBurguerFactory();

        Burguer chickenBurguer = chickenRestaurant.orderBurguer();
        Burguer meatBurguer = meatRestaurant.orderBurguer();
    }

    public void techShopExample(){
        // Shop asusShop = new AsusFactory();
        // Shop msiShop = new MsiFactory();

        // Gpu asusGpu = asusShop.orderProduct();
        // Gpu msiGpu = msiShop.orderProduct();

        Shop asusShop = new AsusFactory();
        Shop msiShop = new MsiFactory();

        Monitor asusMonitor = asusShop.orderMonitor();
        Monitor msiMonitor = msiShop.orderMonitor();
        
        Gpu asusGpu = asusShop.orderGpu();
        Gpu msiGpu = msiShop.orderGpu();
    }


    public static void main(String[] args) throws Exception {
        (new App()).techShopExample();
    }
}

import factory.Shop;
import factory.AsusFactory;
import model.monitor.Monitor;
import factory.MsiFactory;
import model.gpu.Gpu;

public class App {

    public void run1(){
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
        (new App()).run1();
    }
}

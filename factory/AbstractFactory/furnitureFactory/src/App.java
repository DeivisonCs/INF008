import factory.FurnitureFactory;
import factory.classic.ClassicFurnitureFactory;
import factory.modern.ModernFurnitureFactory;
import model.Furniture;

public class App {
    public static void main(String[] args) throws Exception {
        FurnitureFactory classicFurnitureFactory = new ClassicFurnitureFactory();
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();

        Furniture classicSofa = classicFurnitureFactory.buySofa();
        Furniture classicTable = classicFurnitureFactory.buyTable();

        Furniture modernSofa = modernFurnitureFactory.buySofa();
        Furniture modernTable = modernFurnitureFactory.buyTable();
    }
}

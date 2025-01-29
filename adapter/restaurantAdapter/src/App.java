import adapter.FancyMenuAdapter;
import model.XmlData;
import restaurant.SimpleMenu;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleMenu simpleMenu = new SimpleMenu();
        XmlData data = new XmlData("Xml Data");

        simpleMenu.showMenu(data);
        simpleMenu.showRecommendations(data);

        FancyMenuAdapter fancyMenu = new FancyMenuAdapter();
        fancyMenu.showMenu(data);
        fancyMenu.showRecommendations(data);
    }
}

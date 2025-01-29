package restaurant;

import model.XmlData;

public class SimpleMenu implements Menu{

    @Override
    public void showMenu(XmlData data) {
        System.out.println("Menu - Data type: " + data.getType());
    }
    
    @Override
    public void showRecommendations(XmlData data) {
        System.out.println("Recommendations - Data type: " + data.getType());
    }
    
}

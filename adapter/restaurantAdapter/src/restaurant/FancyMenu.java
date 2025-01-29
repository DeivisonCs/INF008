package restaurant;

import model.JsonData;

public class FancyMenu {

    public void showMenu(JsonData data) {
        System.out.println("Menu - Data type: " + data.getType());
    }

    public void showRecommendations(JsonData data) {
        System.out.println("Recommendations - Data type: " + data.getType());
    }
}

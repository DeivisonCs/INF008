package adapter;

import model.JsonData;
import model.XmlData;
import restaurant.FancyMenu;
import restaurant.Menu;

public class FancyMenuAdapter implements Menu{
    private final FancyMenu menuAdapter;

    public FancyMenuAdapter(){
        this.menuAdapter = new FancyMenu();
    }

    @Override
    public void showMenu(XmlData data) {
        JsonData jsonData = this.xmlToJson(data);
        this.menuAdapter.showMenu(jsonData);
    }

    @Override
    public void showRecommendations(XmlData data) {
        JsonData jsonData = this.xmlToJson(data);
        this.menuAdapter.showRecommendations(jsonData);
    }

    private JsonData xmlToJson(XmlData data){
        return new JsonData(data.getData());
    }
}

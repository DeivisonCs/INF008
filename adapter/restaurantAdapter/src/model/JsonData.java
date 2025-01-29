package model;

public class JsonData {
    private String data;
    private String type;

    public JsonData(String data){
        this.data = data;
        this.type = "json";
    }

    public String getData() {
        return data;
    }

    public String getType() {
        return type;
    }
}

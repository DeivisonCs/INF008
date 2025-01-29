package model;

public class XmlData {
    private String data;
    private String type;

    public XmlData(String data){
        this.data = data;
        this.type = "xml";
    }

    public String getData() {
        return data;
    }

    public String getType() {
        return type;
    }

}

package restaurante.model;

public abstract class Burguer {
    private String meat;

    public void prepare(){};

    public String getMeat(){
        return meat;
    }
    public void setMeat(String meat){
        this.meat = meat;
    }
}

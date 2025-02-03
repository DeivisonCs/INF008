package model;

public class GreenColor implements Color{

    private String color;

    public GreenColor (){
        this.color = "Green";
    }

    @Override
    public void paint() {
        System.out.println("Painting color " + this.color);
    }

}

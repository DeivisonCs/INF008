package model;

public class RedColor implements Color{

    private String color;

    public RedColor (){
        this.color = "Red";
    }

    @Override
    public void paint() {
        System.out.println("Painting color " + this.color);
    }

}

package model;

public class CircleShape extends Shape{
    public CircleShape(Color color) {
        super(color);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        super.color.paint();
    }
}

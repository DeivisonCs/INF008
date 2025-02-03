package model;

public class SquareShape extends Shape{

    public SquareShape(Color color) {
        super(color);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Square");
        super.color.paint();
    }

}

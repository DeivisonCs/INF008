import model.CircleShape;
import model.GreenColor;
import model.RedColor;
import model.Shape;
import model.SquareShape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape redCircle = new CircleShape(new RedColor());
        Shape greenCircle = new CircleShape(new GreenColor());
        Shape greenSquare = new SquareShape(new GreenColor());

        redCircle.draw();
        greenCircle.draw();
        greenSquare.draw();
    }
}

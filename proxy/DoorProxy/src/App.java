import model.Door;
import model.SimpleDoor;
import proxy.ProxyDoor;

public class App {
    public static void main(String[] args) throws Exception {
        Door myDoor = new ProxyDoor(new SimpleDoor());

        myDoor.open("pass123");
        myDoor.open("$eCr5te");
    }
}

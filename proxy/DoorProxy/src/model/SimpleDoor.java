package model;

public class SimpleDoor implements Door{

    @Override
    public void open(String password) {
        System.out.println("Opening Door");
    }
    
    @Override
    public void close() {
        System.out.println("Closing Door");
    }
    
}

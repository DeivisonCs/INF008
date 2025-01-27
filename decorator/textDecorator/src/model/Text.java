package model;

public interface Text {
    public void reset();
    public String read();
    public void write(String text);
    public Boolean hasNext();
}

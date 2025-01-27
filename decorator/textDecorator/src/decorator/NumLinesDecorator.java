package decorator;

import decorator.abstractDecorator.TextDecorator;
import model.Text;

public class NumLinesDecorator extends TextDecorator{
    private int countLine;

    public NumLinesDecorator(Text text) {
        super(text);
        this.countLine = 0;
    }

    @Override
    public void reset() {
        super.textDecorated.reset();
    }

    @Override
    public String read() {
        this.countLine++;
        return super.textDecorated.read();
    }

    @Override
    public void write(String text) {
        super.textDecorated.write(text);
    }
    
    @Override
    public Boolean hasNext() {
        if(!super.textDecorated.hasNext()){
            System.out.println("\n\t " + this.countLine + " Lines");
        }
        return super.textDecorated.hasNext();
    }

}

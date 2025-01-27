package decorator;

import decorator.abstractDecorator.TextDecorator;
import model.Text;

public class CountLineDecorator extends TextDecorator{
    private int lineCount;

    public CountLineDecorator(Text text) {
        super(text);
        this.lineCount = 1;
    }

    @Override
    public void reset() {
        this.lineCount = 1;
        super.textDecorated.reset();
    }

    @Override
    public String read() {
        return this.lineCount++ + " " + super.textDecorated.read();
    }

    @Override
    public void write(String text) {
        super.textDecorated.write(text);
    }

    @Override
    public Boolean hasNext(){
        return super.textDecorated.hasNext();
    }
}

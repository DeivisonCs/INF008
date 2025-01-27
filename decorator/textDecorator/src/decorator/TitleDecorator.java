package decorator;

import decorator.abstractDecorator.TextDecorator;
import model.Text;

public class TitleDecorator extends TextDecorator{
    private String title;
    private int lineCount;

    public TitleDecorator(Text text, String title) {
        super(text);
        this.title = title;
        this.lineCount = 0;
    }

    public TitleDecorator(Text text) {
        super(text);
        this.title = "Title";
    }

    @Override
    public void reset() {
        super.textDecorated.reset();
        this.lineCount = 0;
    }

    @Override
    public String read() {

        if(this.lineCount == 0)
            System.out.println("\t" + this.title + "\n");

        this.lineCount++;
        return super.textDecorated.read();
    }

    @Override
    public void write(String text) {
        super.textDecorated.write(text);
    }

    @Override
    public Boolean hasNext(){
        return super.textDecorated.hasNext();
    }

    public void setTilte(String title){
        this.title = title;
    }

}

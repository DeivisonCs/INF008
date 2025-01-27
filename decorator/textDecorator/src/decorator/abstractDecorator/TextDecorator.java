package decorator.abstractDecorator;

import model.Text;

public abstract class TextDecorator implements Text{
    protected Text textDecorated;

    public TextDecorator(Text text){
        this.textDecorated = text;
    }

    @Override
    public String read() {
        return this.textDecorated.read();
    }

    @Override
    public void write(String text) {
        this.textDecorated.write(text);
    }
    
    @Override
    public Boolean hasNext() {
        return this.textDecorated.hasNext();
    }
}

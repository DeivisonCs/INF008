package model;

import java.util.ArrayList;
import java.util.List;

public class Lyric implements Text{
    private List<String> text;
    private int lineCount;

    public Lyric(){
        this.text = new ArrayList<String>();
        this.populate();
        this.reset();
    }
    
    @Override
    public void reset() {
        this.lineCount = 0;
    }

    @Override
    public String read() {
        if(this.hasNext()){
            String line = this.text.get(this.lineCount);
            this.lineCount++;
            return line;
        }

        return null;
    }

    @Override
    public void write(String text) {
        this.text.add(text);
    }

    @Override
    public Boolean hasNext(){
        return this.lineCount < this.text.size();
    }

    public void populate(){
        for(int i=1; i < 6; i++)
            this.text.add("Text Line");
    }
    
}

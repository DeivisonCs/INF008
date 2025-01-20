package model;

public class WordFile extends File{
    public WordFile(String name){
        super(name.concat(".docx"));
    }
}

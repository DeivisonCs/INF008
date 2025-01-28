package model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements SOElement{
    private List<SOElement> files;

    public Folder(){
        this.files = new ArrayList<>();
    }

    @Override
    public Double getSize() {
        return this.files.stream().mapToDouble(SOElement::getSize).sum();
    }

    @Override
    public void show() {
        this.files.stream().forEach(SOElement::show);
    }

    @Override
    public void addFile(SOElement file) {
        this.files.add(file);
    }
    
}

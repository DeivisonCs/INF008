package model;

public class ExcellFile extends File{

    public ExcellFile(String name){
        super(name.concat(".xlsx"));
    }

}

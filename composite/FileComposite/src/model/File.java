package model;

public abstract class File implements SOElement{
    private String name;
    private Double size;

    public File(String name, Double size){
        this.name = name;
        this.size = size;
    }

    @Override
    public Double getSize(){
        return this.size;
    }
    
    @Override
    public abstract void show();
    
    @Override
    public void addFile(SOElement file){
        throw new UnsupportedOperationException("");
    }

    public String getName() {
        return name;
    }
}

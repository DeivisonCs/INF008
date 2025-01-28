package model;

public class ExcellFile extends File{

    public ExcellFile(String name, Double size) {
        super(name, size);
    }

    @Override
    public void show() {
        System.out.println(super.getName() + ".xlsx");
    }

}

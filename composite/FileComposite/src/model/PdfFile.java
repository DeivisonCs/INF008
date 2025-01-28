package model;

public class PdfFile extends File {

    public PdfFile(String name, Double size) {
        super(name, size);
    }

    @Override
    public void show() {
        System.out.println(super.getName() + ".pdf");
    }
}

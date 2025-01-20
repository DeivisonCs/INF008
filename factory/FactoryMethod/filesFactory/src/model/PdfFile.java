package model;

public class PdfFile extends File {

    public PdfFile(String name){
        super(name.concat(".pdf"));
    }
    
}

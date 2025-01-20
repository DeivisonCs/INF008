package factory;

import model.File;
import model.WordFile;

public class PdfFileFactory extends FileFactory{
    @Override
    public void save(File file){
        System.out.println("Saving PDF File...");
    }
    
    @Override
    protected File create(String name) {
        System.out.println("Creating PDF File...");
        return new WordFile(name);
    }

}

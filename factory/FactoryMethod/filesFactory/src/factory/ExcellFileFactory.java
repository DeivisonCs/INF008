package factory;

import model.File;
import model.WordFile;

public class ExcellFileFactory extends FileFactory{

    @Override
    public void save(File file){
        System.out.println("Saving Excell File...");
    }

    @Override
    protected File create(String name) {
        System.out.println("Creating Excell File...");
        return new WordFile(name);
    }
}

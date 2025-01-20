package factory;

import model.File;
import model.WordFile;

public class WordFileFactory extends FileFactory{
    @Override
    public void save(File file){
        System.out.println("Saving Word File...");
    }

    @Override
    protected File create(String name) {
        System.out.println("Creating Word File...");
        return new WordFile(name);
    }
}

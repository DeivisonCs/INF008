package factory;

import model.File;

public abstract class FileFactory {

    public File createFile(String name){
        return this.create(name);
    }

    public abstract void save(File file);
    protected abstract File create(String name);
}

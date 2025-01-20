import factory.ExcellFileFactory;
import factory.FileFactory;
import factory.PdfFileFactory;
import model.File;

public class App {
    public static void main(String[] args) throws Exception {
        FileFactory pdfFileManager = new PdfFileFactory();
        File myPdf = pdfFileManager.createFile("MyProject");
        pdfFileManager.save(myPdf);
        
        FileFactory excellFileManager = new ExcellFileFactory();
        File mySheet = excellFileManager.createFile("MySheet");
        excellFileManager.save(mySheet);   
    }

}

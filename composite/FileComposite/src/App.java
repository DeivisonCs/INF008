import model.ExcellFile;
import model.Folder;
import model.PdfFile;
import model.SOElement;

public class App {
    public static void main(String[] args) throws Exception {
        SOElement pdf1 = new PdfFile("pdf 1",  10.00);
        SOElement pdf2 = new PdfFile("pdf 2",  20.00);
        SOElement pdf3 = new PdfFile("pdf 3",  30.55);
        SOElement pdfFolder = new Folder();
        pdfFolder.addFile(pdf1);
        pdfFolder.addFile(pdf2);
        pdfFolder.addFile(pdf3);
        
        SOElement excell1 = new ExcellFile("excell 1",  10.00);
        SOElement excell2 = new ExcellFile("excell 2",  20.00);
        SOElement excell3 = new ExcellFile("excell 3",  10.45);
        SOElement excellFolder = new Folder();
        excellFolder.addFile(excell1);
        excellFolder.addFile(excell2);
        excellFolder.addFile(excell3);
        
        SOElement pdf4 = new PdfFile("pdf 4",  100.00);
        SOElement mainFolder = new Folder();
        mainFolder.addFile(pdfFolder);
        mainFolder.addFile(excellFolder);
        mainFolder.addFile(pdf4);
        

        System.out.println(mainFolder.getSize());
        mainFolder.show();
    }
}

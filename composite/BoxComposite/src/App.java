import model.Book;
import model.CompositeBox;
import model.Product;
import model.Shoe;

public class App {
    public static void main(String[] args) throws Exception {
        Product book1 = new Book("Book 1",  10.00);
        Product book2 = new Book("Book 2",  20.00);
        Product book3 = new Book("Book 3",  30.55);
        CompositeBox bookBox = new CompositeBox();
        bookBox.addProduct(book1);
        bookBox.addProduct(book2);
        bookBox.addProduct(book3);
        
        Product shoe1 = new Shoe("Shoe 1",  10.00);
        Product shoe2 = new Shoe("Shoe 2",  20.00);
        Product shoe3 = new Shoe("Shoe 3",  10.45);
        CompositeBox shoeBox = new CompositeBox();
        shoeBox.addProduct(shoe1);
        shoeBox.addProduct(shoe2);
        shoeBox.addProduct(shoe3);
        
        Product book4 = new Book("Book 4",  100.00);
        CompositeBox box = new CompositeBox();
        box.addProduct(bookBox);
        box.addProduct(shoeBox);
        box.addProduct(book4);
        

        System.out.println(box.calculatePrice());
        box.show();
    }
}

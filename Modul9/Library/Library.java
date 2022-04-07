import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class Library
     */
    public Library(String name)
    {
        // initialise instance variables
        this.name = name;
        books = new ArrayList<>();
    }
    
    public void addBook(String bookTitle, String author) {
        books.add(new Book(bookTitle, author));
    }
    
    public int getNumberofBooks() {
        return books.size();
    }
    
    public void listAllBooks() {
        for (Book book : books) {
            System.out.println("-------------------------------------------");
            System.out.println(book.getBookInfo());
        }   
    }
}

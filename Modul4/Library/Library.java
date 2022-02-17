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
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        books = new ArrayList<>();
    }
    
    public void addBook(Book bookname) {
        books.add(bookname);
    }
    
    public int getNumberofBooks() {
        return books.size();
    }
    
    public void listBook(int index){
        if(index >= 0 && index < books.size()) {
            Book bookname = books.get(index);
            System.out.println(bookname.getBookname());
        }
    }
    
    public void removeBook(int index){
        if(index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }
    
    public void listAllBooksFor(){
        for(Book bookname : books){
            System.out.println(bookname.getBookname());
        }
    }
    
    public void listAllBooksWhile(){
        int index = 0;
        while(index < books.size()) {
            Book bookname = books.get(index);
            System.out.println(bookname.getBookname());
            index++;
        }
    }
    
    public void listAllBooksWhileIterator(){
        Iterator <Book> bn = books.iterator();
        while(bn.hasNext()){
            Book b = bn.next();
            System.out.println(b.getBookname());
        }
    }
    
    public void removeSpesBook(){
        Iterator <Book> bn = books.iterator();
        while(bn.hasNext()){
            Book b = bn.next();
            String bookname = b.getBookname();
            if (bookname.equals("Harry Potter and the Goblet of Fire")){
                bn.remove();
            }
        }
    }
}

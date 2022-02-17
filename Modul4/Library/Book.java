
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String bookname;

    /**
     * Constructor for objects of class Book
     */
    public Book(String bookname){
        // initialise instance variables
        setBookname(bookname);
    }
    
    public String getBookname(){
        return bookname;
    }

    private void setBookname(String bookname){
        this.bookname = bookname;
    }
}

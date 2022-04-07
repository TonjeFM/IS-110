
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String bookTitle;
    private String author;

    /**
     * Constructor for objects of class Book
     */
    public Book(String bookTitle, String author){
        // initialise instance variables
        this.bookTitle = bookTitle;
        this.author = author;
    }
    
    public String getBookInfo(){
        String info = "Name of book: " + bookTitle + "\n" 
                      + "Author: " + author;
        return info;
    }

    
}

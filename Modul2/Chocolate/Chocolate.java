
/**
 * Write a description of class Chocolate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chocolate
{
    // instance variables - replace the example below with your own
    private String chocolateName;
    private int stockNumber;

    /**
     * Constructor for objects of class Sjokolade
     */
    public Chocolate(String name, int number)
    {
        // initialise instance variables
        chocolateName = name;
        stockNumber = number;
    }

    public String getName()
    {
        return chocolateName;
    }
    
    public int getStock()
    {
        return stockNumber;
    }
    
    public void checkStock()
    {
        if(stockNumber <= 0) {
            System.out.println("Out of stock");
        }
        else{
            System.out.println(stockNumber + " " + chocolateName +" in stock");
        }
    }
    
    public void changeStock(int number)
    {
        stockNumber = stockNumber + number;
    }

}

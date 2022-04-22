import java.util.ArrayList;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character extends Vault
{
    private String fullName;
    private int birthYear;
    private String hogwartsHouse;

    /**
     * Constructor for objects of class Character
     */
    public Character(String franchise, String name, int year, String house) {
        // initialise instance variables
        super(franchise);
        fullName = name;
        birthYear = year;
        hogwartsHouse = house;
    }

    public void displayCharacter() {
        System.out.println("Name: " + fullName);
        System.out.println("Birthyear: " + birthYear);
        System.out.println("Hogwarts House: " + hogwartsHouse);
    }
}

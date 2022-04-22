import java.util.ArrayList;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Creature
{
    private String world;
    private String creatureName;
    private String creatureType;

    /**
     * Constructor for objects of class Creature
     */
    public Creature(String franchise, String name, String animal) {
        world = franchise;
        creatureName = name;
        creatureType = animal;
    }

    public void displayCreature() {
        System.out.println("Wizarding World: " + world);
        System.out.println("Name: " + creatureName);
        System.out.println("Creature: " + creatureType);
    }
}


/**
 * Write a description of class Vault here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vault
{
    // instance variables - replace the example below with your own
    private String world;

    /**
     * Constructor for objects of class Vault
     */
    public Vault(String franchise) {
        // initialise instance variables
        world = franchise;
    }

    public void displayVault() {
        System.out.println("Wizarding World: " + world);
    }
}

import java.util.ArrayList;
/**
 * Write a description of class WizardingWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WizardingWorld
{
    // instance variables - replace the example below with your own
    private ArrayList<Vault> vaults;

    /**
     * Constructor for objects of class WizardingWorld
     */
    public WizardingWorld()
    {
        vaults = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addVault(Vault vault)
    {
        vaults.add(vault);
    }

    public void show()
    {

        for(Vault vault : vaults) {
            vault.displayVault();
            System.out.println();   
        }
    }
}

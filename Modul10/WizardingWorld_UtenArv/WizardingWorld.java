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
    private ArrayList<Character> characters;
    private ArrayList<Creature> creatures;
    private ArrayList<Artifact> artifacts;

    /**
     * Constructor for objects of class WizardingWorld
     */
    public WizardingWorld()
    {
        characters = new ArrayList<>();
        creatures = new ArrayList<>();
        artifacts = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addCharacter(Character character)
    {
        characters.add(character);
    }

    public void addCreature(Creature creature)
    {
        creatures.add(creature);
    }

    public void addArtifact(Artifact artifact)
    {
        artifacts.add(artifact);
    }

    public void show()
    {

        for(Character character : characters) {
            character.displayCharacter();
            System.out.println();   
        }

        for(Creature creature : creatures) {
            creature.displayCreature();
            System.out.println();   
        }

        for(Artifact artifact : artifacts) {
            artifact.displayArtifact();
            System.out.println();   
        }
    }
}

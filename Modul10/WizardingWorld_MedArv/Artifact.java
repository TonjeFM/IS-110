import java.util.ArrayList;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Artifact extends Vault
{

    private String artifactName;
    private String artifactType;

    /**
     * Constructor for objects of class Artifact
     */
    public Artifact(String franchise, String artifact, String type) {
        // initialise instance variables
        super(franchise);
        artifactName  = artifact;
        artifactType = type;
    }

    public void displayArtifact() {
        System.out.println("Artifact: " + artifactName);
        System.out.println("Type: " + artifactType);
    }
}

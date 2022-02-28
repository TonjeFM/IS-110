import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

/**
 * Write a description of class Spells here.
 *
 * @author Tonje Markseth
 * @version 28.02.2022
 */
public class Spells
{
    // instance variables - replace the example below with your own
    private ArrayList<String> randomSpells;
    private Scanner reader;
    private HashMap<String, String> spellMap;
    private Random randomGenerator;

    /**
     * Constructor for objects of class Spells
     */
    public Spells()
    {
        randomSpells = new ArrayList<>();
        randomListOfSpells();
        spellMap = new HashMap<>();
        randomGenerator = new Random();
        fillSpellMap();
        reader = new Scanner(System.in);
        
    }
    
    public void start(){
        boolean finished = false;
        System.out.println("Welcome to Hogwarts! Type in a spell and you will learn what\n" + 
                           "the spell does. If you don't know any spells, type a random\n" + 
                           "word and you will get a spell you can learn about. ");
        while(!finished){
            HashSet<String> input = getInput();
            if(input.contains("bye")){
                    finished = true;
                    System.out.println("Hope you learned some nifty spells to cause some\n" + 
                    "mischief at Hogwarts. Mischief Managed!");
            }
            else{
                String spellCast = generateSpell(input);
                System.out.println(spellCast);
            }
        }
    }

    /**
     * @param The user types a String which is used in getInput()
     * @return Returns a random spell
     */
    private String generateSpell(HashSet<String> spells) {
        for(String spell : spells){
            String response = spellMap.get(spell);
            if(response != null){
                return response;
            }
        }
        return pickRandomSpell();
    }
    
    /**
     * @return  Returns a String(spell) that the user has typed in 
     */
    private HashSet<String> getInput(){
        String inputline = reader.nextLine().trim().toLowerCase();
        String[] spellArray = inputline.split(" ");
        HashSet<String> spells = new HashSet<>();
        for(String spell : spellArray){
            spells.add(spell);
        }
        return spells;
    }
    
    /**
     * Keywords (spells) and their information in a spell map.
     */
    private void fillSpellMap()
    {
        spellMap.put("accio", 
                        "The ideal spell for the lazy, this summoning charm can be used\n" +  
                        "to bring an object closer to you.");
        spellMap.put("riddikulus",
                        "This boggart-banishing spell takes something scary and turns it\n" +
                        "into something silly. You know, like when Neville Longbottom\n" +
                        "pictured the frightening Professor Snape...\n" +
                        "then put him in his grandmother's clothes.");
        spellMap.put("alohomora",
                     "Forgot your keys? Sneaking into a place you don't belong?\n" + 
                     "Managing mischief? This unlocking charm means you'll never need a\n" + 
                     "locksmith again.");
        spellMap.put("lumos",
                     "Why carry a flashlight when you can use this charm to illuminate\n" + 
                     "the tip of your wand? This is a surprisingly useful spell.");              
        spellMap.put("expelliarmus",
                     "Go on the defensive with this disarming incantation that knocks\n" + 
                     "things, like your opponent's wand, out of hand.");
    }
    
    /**
     * List of random spells
     */
    private void randomListOfSpells() {
        randomSpells.add("Accio");
        randomSpells.add("Alohomora");
        randomSpells.add("Riddikulus");
        randomSpells.add("Expelliarmus");
        randomSpells.add("Lumos");
    }
    /**
     * Selects a spell by random and returns it
     * @return A random spell
     */
    private String pickRandomSpell(){
        int index = randomGenerator.nextInt(randomSpells.size());
        return randomSpells.get(index);
    }
}

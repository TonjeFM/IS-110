
/**
 * Write a description of class WizardingCurrency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WizardingCurrency
{
    // instance variables - replace the example below with your own
    private int galleon;
    private int sickle;
    private int knut;

    /**
     * Constructor for objects of class WizardingCurrency
     */
    public WizardingCurrency()
    {
        // initialise instance variables
        galleon = 100;
        sickle = 26;
        knut = 5;
    }

    public void wizardingCurrencyToNok(String currency){
        if( currency == "galleon"){
            double nok = galleon*58.71;
            System.out.println(galleon + " galleon = " + nok + " NOK");
        }
        if( currency == "sickle"){
            double nok = sickle*3.43;
            System.out.println(sickle + " sickle = " + nok + " NOK");
        }
        if( currency == "knut"){
            double nok = knut*0.08;
            System.out.println(knut + " knut = " + nok + " NOK");
        }
    }
}

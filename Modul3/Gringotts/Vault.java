
/**
 * Write a description of class Vault here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vault
{
    public void checkBalance() {
        WizardingCurrency wizardingCurrency = new WizardingCurrency();
        System.out.println("You have " + wizardingCurrency.galleon + " galleons in you vault");
        System.out.println("You have " + wizardingCurrency.sickle + " sickles in you vault");
        System.out.println("You have " + wizardingCurrency.knut + " knuts in you vault");
        wizardingCurrency = wizardingCurrencyToNok("galleon");
        wizardingCurrency = wizardingCurrencyToNok("sickle");
        wizardingCurrency = wizardingCurrencyToNok("knut");
    }
    
    public WizardingCurrency wizardingCurrencyToNok(String currency){
        WizardingCurrency exhange = new WizardingCurrency();
        exhange.wizardingCurrencyToNok(currency);
        return exhange;
        
    }
    
}

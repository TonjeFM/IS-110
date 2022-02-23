
/**
 * Write a description of class Calendar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calendar
{
    
    private String[] monthCounter;

    public Calendar()
    {
        monthCounter = new String[13];
        monthCounter[0] = null;
        monthCounter[1] = "Januar";
        monthCounter[2] = "Februar";
        monthCounter[3] = "Mars";
        monthCounter[4] = "April";
        monthCounter[5] = "Mai";
        monthCounter[6] = "Juni";
        monthCounter[7] = "Juli";
        monthCounter[8] = "August";
        monthCounter[9] = "September";
        monthCounter[10] = "Oktober";
        monthCounter[11] = "November";
        monthCounter[12] = "Desember";
    }

    public void printMonths()
    {
        for(int i = 0; i < monthCounter.length; i++){
            //System.out.println(i + " " + monthCounter[i]);
            System.out.println(i == 2 ? "Dette er den andre måneden i året" : i + " " + monthCounter[i]);
        }
    }
}

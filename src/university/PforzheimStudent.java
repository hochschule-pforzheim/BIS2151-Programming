package university;

/**
 * Example PforzheimStudent Class for the Lecture including Inheritance
 *
 * @author Andreas Schneider
 */
public class PforzheimStudent extends Student
{

    public void study(int hoursOfStudy)
    {
        for (int x = hoursOfStudy; x >= 0; x--)
        {
            if (x == 0)
            {
                System.out.println("Finished studying.");
            } else if (x == 1)
            {
                System.out.println("Studying ... " + x + " hour to go.");
            } else
            {
                System.out.println("Studying ... " + x + " hours to go.");
            }
        }
        System.out.println("Crazy how much Pforzheim students are studying!");
    }
}

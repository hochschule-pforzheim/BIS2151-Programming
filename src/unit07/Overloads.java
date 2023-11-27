package unit07;

/**
 * Example class for overloading
 *
 * @author Andreas Schneider
 */
public class Overloads
{

    String uniqueID;

    public int addNums(int a, int b)
    {
        return a + b;
    }

    public double addNums(double a, double b)
    {
        return a + b;
    }

    public void setUniqueID(String theID)
    {
        // lots of validation code to imagine
        uniqueID = theID;
    }

    public void setUniqueID(int newNumber)
    {
        String numString = "" + newNumber;
        setUniqueID(numString);
    }
}

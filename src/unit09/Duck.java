package unit09;

/**
 * Example Duck class
 *
 * @author Andreas Schneider
 */
public class Duck
{

    int size;

    public Duck()
    {
        // the standard size of a duck is 7
        size = 7;
    }

    public Duck(int ducksize)
    {
        if (ducksize > 0)
        {
            size = ducksize;
        } else
        {
            size = 7;
        }
    }
    
    // more Duck code to imagine
}

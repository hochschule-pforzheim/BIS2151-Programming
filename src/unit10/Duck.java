package unit10;

/**
 * Example Duck Static
 *
 * @author mail
 */
public class Duck
{

    private int size = 5;
    private static int duckCount = 0;

    public Duck()
    {
        duckCount++;
    }

    public void setSize(int s)
    {
        size = s;
    }

    public int getSize()
    {
        return size;
    }
}

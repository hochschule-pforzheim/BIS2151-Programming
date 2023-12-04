package unit08;

/**
 * Subclass Dog
 *
 * @author Andreas Schneider
 */
public class Dog extends Canine implements Pet
{

    /**
     * Overriding roam
     */
    @Override
    public void roam()
    {
        System.out.println("Roaming in a group!");
    }

    @Override
    public void beFriendly()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void play()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

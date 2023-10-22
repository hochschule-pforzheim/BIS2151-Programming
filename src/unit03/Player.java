package unit03;

/**
 * Example "The guessing game"
 *
 * @author Kathy Sierra
 * @author Bert Bates
 * @author Andreas Schneider
 *
 */
public class Player
{

    int number = 0; // where the guess goes

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + number);
    }
}

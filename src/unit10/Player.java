package unit10;

/**
 * Example Player Class
 *
 * @author Andreas Schneider
 */
public class Player
{

    static int playerCount = 0;
    private String name;

    public Player(String n)
    {
        name = n;
        playerCount++;
    }
}

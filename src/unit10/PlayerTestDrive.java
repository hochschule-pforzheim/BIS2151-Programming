package unit10;

/**
 * Example Player Test Drive
 *
 * @author Andreas Schneider
 */
public class PlayerTestDrive
{

    public static void run()
    {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}
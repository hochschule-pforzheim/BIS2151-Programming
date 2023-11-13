package unit03;

/**
 * Example "The guessing game"
 *
 * @author Kathy Sierra
 * @author Bert Bates
 * @author Andreas Schneider
 *
 */
public class GameLauncher
{

    public static void run(String[] args)
    {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

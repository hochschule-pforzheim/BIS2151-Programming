package unit05;

/**
 * Example Solution for Coding Session #1
 *
 * @author Andreas Schneider
 */
public class CodingSessionOne
{
    public static void run()
    {
        char[] words = {'H', 'E', 'L', 'L', 'O'};
        // Alternatively
        String[] wordString = {"H", "E", "L", "L", "O"};
        words[4] = '0';
        System.out.println(words);
    }
}

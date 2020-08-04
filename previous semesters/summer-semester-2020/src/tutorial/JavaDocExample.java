package tutorial;

/**
 *
 * @author Jonathan Hinkel
 */
public class JavaDocExample 
{
    /**
     * This is a method to determine whether a number is odd or even
     * @param i The integer in question
     * @return true if the number is even, false otherwise 
     */
    public static boolean isEven(int i)
    { 
        return (i%2 == 0); 
    }
    
    /**
     * Returns a random integer between min and max
     * @param min
     * @param max
     * @return random int
     */
    public static int generateRandomInt(int min, int max)
    {
        return min + (int) (Math.random() * (max - min)) + 1; 
    }
    
}

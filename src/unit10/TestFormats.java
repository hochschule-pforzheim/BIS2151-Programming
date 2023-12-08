package unit10;

/**
 * Number Format Example
 *
 * @author Andreas Schneider
 */
public class TestFormats
{

    public static void run()
    {
        String first = String.format("%, d", 1000000000);
        System.out.println(first);
        String second = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(second);
    }
}

package unit10;

import java.util.Date;

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

        // Combination
        int one = 20456654;
        double two = 199567890.248907;
        String third = String.format("The rank is %,d out of %,.2f", one, two);

        // Timestamps
        String tOne = String.format("%tc", new Date());
        System.out.println(tOne);
        String tTwo = String.format("%tr", new Date());
        System.out.println(tTwo);
    }
}

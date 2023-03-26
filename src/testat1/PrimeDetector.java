package testat1;

/**
 * Possible solution for the PrimeDetector class of testat 1 task 3.
 *
 * @author Andreas R. Schneider (@ainzone)
 */
public class PrimeDetector
{

    public static void main(String[] args)
    {
        int number = 0, count = 0, factor = 2;
        
        // Check if there is exactly one argument
        if (args.length != 1)
        {
            System.out.println("Input error");
        }

        // Check if the argument is an integer
        try
        {
            number = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input error");
        }

        // Check if the argument is lower than 1
        if (number < 1)
        {
            System.out.println("Input error");
        }

        System.out.print("Prime factors (beside 1) are: ");

        while (number > 1)
        {
            if (number % factor == 0)
            { //no rest in division
                System.out.print(" " + factor);
                count++; // one factor more found
                number = number / factor--;
            }
            factor++;
        }

        System.out.println("\r\n" + args[0] + " has " + count + " prime factors");
    }
}

package attestation1;

import java.util.Scanner;

/**
 * Possible solution for attestation 1
 *
 * @author ainzone
 * @version 1.0
 */
public class EvilSeven
{

    private static int numStart, numEnd;

    /**
     * Start of the attestation 1
     *
     * @param args
     */
    public static void main(String[] args)
    {
        checkArguments(args);
        numStart = checkNumStart(numStart);
        numEnd = checkNumEnd(numStart, numEnd);
        run();
    }

    /**
     * Checking whether the arguments are valid or not.
     *
     * @param args
     */
    private static void checkArguments(String[] args)
    {
        if (args.length >= 1)
        {
            try
            {
                numStart = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe)
            {
                numStart = 0;
            }
        }
        if (args.length >= 2)
        {
            try
            {
                numEnd = Integer.parseInt(args[1]);
            } catch (NumberFormatException nfe)
            {
                numEnd = 0;
            }
        }
        if (args.length > 2)
        {
            System.out.println("You have given more than two arguments. Only the first two will be taken!");
        }
    }

    /**
     * Checks if argument 1 is a valid integer. If not the user may enter a new
     * number.
     *
     * @param inputNumStart
     * @return returning the correct number
     */
    private static int checkNumStart(int inputNumStart)
    {
        while (inputNumStart <= 0)
        {
            System.out.printf("Argument (1) is invalid. Please give a valid start number greater or equal to 1: ");
            try
            {
                Scanner inputStartScanner = new Scanner(System.in);
                inputNumStart = Integer.parseInt(inputStartScanner.next().trim());
            } catch (NumberFormatException nfe)
            {
                inputNumStart = 0;
            }
        }
        return inputNumStart;
    }

    /**
     * Checks if argument 2 is a valid integer and greater than argument 1. If
     * not the user may enter a new number.
     *
     * @param inputNumStart  
     * @param inputNumEnd
     * @return returning the correct number
     */
    private static int checkNumEnd(int inputNumStart, int inputNumEnd)
    {
        while (inputNumEnd <= 0 || inputNumStart > inputNumEnd)
        {
            System.out.printf("Argument (2) is invalid. Please give a valid start number higher than Argument (1): ");
            try
            {
                Scanner inputEndScanner = new Scanner(System.in);
                inputNumEnd = Integer.parseInt(inputEndScanner.next().trim());
            } catch (NumberFormatException nfe)
            {
                inputNumEnd = 0;
            }
        }
        return inputNumEnd;
    }

    /**
     * Starts the loop and checks if the results contain a 7 or if they are
     * divisable by 7.
     */
    private static void run()
    {
        System.out.println("EvilSeven starting with " + numStart + " and is running up to " + numEnd + ":");
        for (int i = numStart; i <= numEnd; i++)
        {
            if (!((i % 7 == 0) || Integer.toString(i).contains("7")))
            {
                System.out.println(i);
            }
        }
    }
}

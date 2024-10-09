package unit02;

/**
 * This class demonstrates basic Java programming concepts such as methods, 
 * loops, and conditional statements. It is part of the lecture from 09 October 2024.
 * The program performs simple arithmetic, iteration, and grading functionality 
 * based on given conditions.
 * 
 * @author Andreas R. Schneider
 */
public class LectureContent
{
    /**
     * This is the main method that is executed when the program runs. 
     * It prints "Hello World!", performs an addition operation, 
     * and demonstrates iteration functionality.
     * 
     * @param args - Command line arguments (not used in this program)
     */
    public static void run(String[] args)
    {
        // Printing a simple message to the console
        System.out.println("Hello World!");

        // Performing addition of two numbers and printing the result
        int result = addition(100, 200);
        System.out.println(result);

        // Calling the iteration method which demonstrates both for-loop and while-loop
        iteration();
        
        // The grading method is commented out but can be used to determine grades 
        // based on a given score
        grading(105);
    }

    /**
     * This method takes two integers as parameters, adds them together, 
     * and returns the result.
     * 
     * @param numberOne - The first number to be added
     * @param numberTwo - The second number to be added
     * @return result - The sum of the two numbers
     */
    public static int addition(int numberOne, int numberTwo)
    {
        // Calculating the sum of the two numbers
        int result = numberOne + numberTwo;
        return result;  // Returning the calculated result
    }

    /**
     * This method demonstrates iteration using both a for-loop and a while-loop. 
     * It prints whether the iteration count is even or odd in the for-loop, 
     * and then simply iterates again using a while-loop.
     */
    public static void iteration()
    {
        // A for-loop that iterates 10 times
        for (int i = 0; i < 10; i++)
        {
            // Printing the iteration number
            System.out.println("Iteration " + i);

            // Checking if the current iteration number is even or odd
            if (i % 2 == 0)
            {
                System.out.println("EVEN!");
            }
            else
            {
                System.out.println("ODD!");
            }
        }

        // A while-loop that iterates while number is less than 10
        int number = 0;
        while (number < 10)
        {
            // Printing the iteration number
            System.out.println("Iteration " + number);
            number++; // Incrementing the number
        }
    }

    /**
     * This method takes a student's points as input and determines the grade based 
     * on the points using conditional if-statements. It handles cases from A to F, 
     * and also checks if the points exceed the maximum allowed value.
     * 
     * @param points - The score for which the grade is to be calculated
     */
    public static void grading(int points)
    {
        // Checking if points exceed the maximum of 100
        if (points > 100)
        {
            System.out.println("Points are too high to calculate!");
        }
        
        // Grade calculation based on point ranges
        if (points >= 90 && points <= 100)
        {
            System.out.println("The Grade is an A.");
        }

        if (points >= 80 && points < 90)
        {
            System.out.println("The Grade is a B.");
        }

        if (points >= 70 && points < 80)
        {
            System.out.println("The Grade is a C.");
        }

        if (points >= 60 && points < 70)
        {
            System.out.println("The Grade is a D.");
        }

        // If points are below 60, the grade is an F
        if (points < 60)
        {
            System.out.println("The Grade is an F.");
        }
    }
}
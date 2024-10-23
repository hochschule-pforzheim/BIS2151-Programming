package unit04;

/**
 * This is the 'Foobar' class. It contains methods that perform certain tasks,
 * like running a loop and doing calculations. The class is public, which means
 * it can be accessed from other classes.
 * 
 * @date 23 October 2024
 * 
 * @author Andreas R. Schneider
 */
public class Foobar
{

    /*
     * This is the 'run' method. It doesn't return any value (void), and it will execute whenever it is called.
     * Inside this method, we are using variables and a for-loop to perform calculations.
     */
    public static void run()
    {
        // We declare and initialise two integer variables, 'foo' and 'bar'.
        int foo = 12;
        int bar = 5;

        /*
         * This is a for-loop that repeats the code inside it 10 times.
         * 'counter' starts at 0 and increases by 1 each time until it reaches 9 (less than 10).
         */
        for (int counter = 0; counter < 10; counter++)
        {
            // 'argumentOne' is the result of adding 'foo' and 'counter'.
            int argumentOne = foo + counter;

            // 'argumentTwo' is the result of adding 'bar' and 'counter'.
            int argumentTwo = bar + counter;

            // Here, we call the 'calculate' method, passing 'argumentOne' and 'argumentTwo' as parameters.
            calculate(argumentOne, argumentTwo);
        }

    }

    /*
     * This is the 'calculate' method. It takes two integer arguments, 'a' and 'b', and performs a calculation using them.
     * It then prints the result of that calculation.
     */
    public static void calculate(int a, int b)
    {
        /*
         * This is the calculation part. The result is computed as 'a' multiplied by 'b+1', plus '2*b'.
         * The result is stored in the variable 'result'.
         */
        int result = (a * (b + 1)) + (2 * b);

        // This line prints out the result of the calculation to the console.
        System.out.println("Result of the calculation " + result);

        /*
         * Another way to print the result would be to use two separate print statements.
         * The first would print the text, and the second would print the result.
         * This is commented out, but you can use this style if preferred:
         * System.out.print("Result of the calculation ");
         * System.out.print(result);
         */
    }
}

package unit04;

/**
 * The {@code Exercise} class demonstrates basic concepts such as method
 * creation, working with parameters, and object manipulation. It includes
 * methods to calculate a sum, increment a number, and handle object references
 * in memory.
 *
 * @date 23 October 2024
 *
 * @author Andreas R. Schneider
 */
public class Exercise
{

    /**
     * The {@code run} method demonstrates the usage of different methods in
     * this class. It calls {@code calculateSum}, {@code increment}, and
     * {@code snippet} methods.
     */
    public static void run()
    {
        calculateSum(3, 7);  // Calling calculateSum with arguments 3 and 7
        increment(100);      // Calling increment with the argument 100
        snippet();           // Calling snippet to demonstrate object manipulation
    }

    /**
     * This method calculates and prints the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     *
     * The sum of {@code a} and {@code b} is printed to the console. Example: If
     * a = 3 and b = 7, it will print 10.
     */
    private static void calculateSum(int a, int b)
    {
        int sum = a + b;  // Sum of a and b
        System.out.println(sum);  // Print the result
        // Another way to achieve the same result is: System.out.println(a + b);
    }

    /**
     * This method increments a given integer by 1 and prints the result before
     * and after the increment operation.
     *
     * @param num the integer to be incremented
     *
     * The method prints the value of {@code num} before and after the
     * increment. Example: If num = 100, it will print 100 before and 101
     * afterwards.
     */
    private static void increment(int num)
    {
        System.out.println("Number before: " + num);  // Print the initial value of num
        num++;  // Increment num by 1 (same as num = num + 1)
        System.out.println("Number afterwards: " + num);  // Print the updated value
    }

    /**
     * This method demonstrates object manipulation and memory handling. It
     * creates a new {@code Person} object, prints its reference, then sets the
     * object reference to null, indicating that the object is now eligible for
     * garbage collection.
     *
     * The method prints the object's reference before and after setting it to
     * null.
     */
    private static void snippet()
    {
        // Create a new Person object (p1)
        Person p1 = new Person();
        System.out.println("Object ID of p1: " + p1.toString());  // Print the object's reference

        // Set p1 to null, meaning it no longer refers to the Person object
        p1 = null;

        // This line will cause a NullPointerException because p1 is now null
        // Uncomment the next line if you want to observe the exception in action:
        // System.out.println("Object ID of p1: " + p1.toString());
    }
}

package unit15;

/**
 * Task 3 with 2 points from the mock exam
 *
 * @author Andreas Schneider
 */
public class TaskThree
{

    public static int doublette(int number)
    {
        return number++ + 2;
    }
    // ... a little further down the class you read:

    public static void run()
    {
        int test1 = 2;
        int test2 = doublette(doublette(test1));
        test1 += test2 + test2 / -test2--;
        System.out.println("test1 value is: " + test1);
        // System.out.println("test2 value is: " + test2);
    }

}

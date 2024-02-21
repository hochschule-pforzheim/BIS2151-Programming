package exam;

/**
 * Solution to task three of the winter term 2023/24 exam
 *
 * @author Andreas Schneider
 */
public class ExamTaskThree
{

    public static int triple(int number)
    {
        return number++ + 2;
    }

    public static void test()
    {
        int test1 = 5;
        int test2 = triple(triple(test1));

        test1 += test2 - test2 / -test2--;
        System.out.println("test1 value is: " + test1);
    }

}

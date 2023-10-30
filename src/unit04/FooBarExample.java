package unit04;

/**
 * Example FooBar
 *
 * @author Andreas Schneider
 */
public class FooBarExample
{

    void go()
    {
        int foo = 8;
        int bar = 3;
        for (int i = 0; i < 10; i++)
        {
            takeTwo(foo + i, bar + i);
        }
    }

    void takeTwo(int x, int y)
    {
        int z = x * 2 - y;
        System.out.println("Total is " + z);
        // End of method takeTwo()
    }
}

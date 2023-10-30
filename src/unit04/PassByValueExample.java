package unit04;

/**
 * Example Pass-By-Value
 *
 * @author Andreas Schneider
 */
public class PassByValueExample
{

    void run()
    {
        int size = 7; // declare int Variable size , set value to 7
        go(size); // call method go() with value that is 7
        System.out.println("size has now the value: " + size);
    }

    void go(int anInt)
    {
        anInt = anInt + 2;
        String info = "anInt is now: " + anInt;
        System.out.println(info);
    }
}

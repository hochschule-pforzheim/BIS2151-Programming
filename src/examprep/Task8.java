/*
 * Task 8:
 * Consider the following piece of code. What is the value of t1 at the end of the test() method?
 */
package examprep;

public class Task8
{

    public int square(int t1)
    {
        t1 *= t1;
        return t1;
    }

    // here's some other code.
    public void test()
    {
        int t1 = 4;
        int t2 = square(t1);
        t1 += t2 - 4 - --t1;
    }

}

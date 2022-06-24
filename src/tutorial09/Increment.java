package tutorial09;

/**
 *
 * @author Pfäfflin
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0;

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        System.out.println(addNum(10));
    }

    public static int addNum(int num) {
        num++;
        // -> Num + 1
        num += 2;
        return num;
    }
}

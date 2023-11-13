package unit05;

import java.util.ArrayList;

/**
 * Example code for ArrayLists
 *
 * @author Andreas Schneider
 */
public class ArrayListExample
{

    public static void run(String[] args)
    {
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("Java");
        myStrings.add("ArrayList");
        System.out.println("Elements in the list: " + myStrings);
    }
}

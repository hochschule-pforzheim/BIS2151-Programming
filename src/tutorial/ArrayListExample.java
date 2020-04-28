package tutorial;

import java.util.*;

/**
 * Tutorial BIS2151
 * @author ainzone
 * @version 1.0
 */
public class ArrayListExample
{
    /**
     * Simply runs the example for ArrayList in Java.
     */
    public static void runExample()
    {
        // size of our ArrayList
        int n = 5; 
  
        // declaring the ArrayList with the size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // adding values to the ArrayList
        for (int i=1; i<=n; i++) 
        {
            arrli.add(i);
        } 
        
        // printing elements
        System.out.println(arrli); 
  
        // removing element at index 3
        arrli.remove(3); 
        
        // printing elements after deletion
        System.out.println(arrli); 
  
        // print elements one by one
        for (int i = 0; i < arrli.size(); i++) 
        {
            System.out.print(arrli.get(i)+" ");
        }
             
    }
}

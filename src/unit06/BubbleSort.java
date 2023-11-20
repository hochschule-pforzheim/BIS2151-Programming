package unit06;

/**
 * Example class for a bubble sort implementation based on Nikita Tiwari
 *
 * @author Andreas Schneider
 * @author Nikita Tiwari
 */
public class BubbleSort
{

    /**
     * Method for running a bubble sort based on an Array "arr" and the array's
     * length "n"
     *
     * @param arr
     * @param size
     */
    public static void run(int arr[], int size)
    {
        int outer, inner, temp;
        boolean swapped;
        for (outer = 0; outer < size - 1; outer++) 
        {
            swapped = false;
            for (inner = 0; inner < size - outer - 1; inner++) 
            {
                if (arr[inner] > arr[inner + 1]) 
                {
                    // Swap arr[inner] and arr[inner+1]
                    temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (swapped == false) 
            {
                break;
            }
        }
    }

    /**
     * Method for printing the given array.
     *
     * @param arr
     * @param size
     */
    public static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

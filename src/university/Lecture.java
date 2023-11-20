package university;

/**
 * Central Class for starting different methods within the project
 *
 * @author Andreas Schneider
 * @version 1.0
 */
public class Lecture
{

    public static void main(String[] args)
    {
        // unit04.StudentManager.run();
        // unit05.StudentStorage.run();
        // unit05.WrapperExample.run();
        // unit05.CodingSessionOne.run();
        // StudentManager.run();
        // StudentManager.printStudents();

        // Bubble Sort Section
        int demoArray[] = {64, 34, 25, 12, 22, 11, 90};
        int length = demoArray.length;
        unit06.BubbleSort.run(demoArray, length);
        System.out.println("Sorted array: ");
        unit06.BubbleSort.printArray(demoArray, length);

    }
}

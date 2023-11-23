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

        // StudentManager.printOutAllStudents();
        // StudentManager.printSpecificStudent(0);
        // StudentManager.printSpecificStudent(-3);
        // With Exception
        // StudentManager.errorStudentException(-3);
        /*
        // Bubble Sort Section
        int demoArray[] = {64, 34, 25, 120, 22, 11, 90};
        int length = demoArray.length;
        unit06.BubbleSort.run(demoArray, length);
        System.out.println("Sorted array: ");
        unit06.BubbleSort.printArray(demoArray, length);*/
        StudentManager.helloStudent();

    }

    public static void explicitConv()
    {
        int higherNumber = 120;
        byte smallerNumber = (byte) higherNumber;

        float sumRandomNumber = 45000.32f;
        double interestingNumber = sumRandomNumber;
        int numberOne = (int) sumRandomNumber;

    }
}

package unit14;

/**
 * Defining an interface "Student" for further implementation
 *
 * @author Andreas Schneider
 */
interface Student
{

    void study();

    void attendClasses();
}

/**
 * Example use case of a anonymous class
 *
 * @author Andreas Schneider
 */
public class AnonymousClassExample
{

    public static void run()
    {

        // Create an anonymous class implementing the Student interface
        Student businessStudent = new Student()
        {
            @Override
            public void study()
            {
                System.out.println("Business School student is studying.");
            }

            @Override
            public void attendClasses()
            {
                System.out.println("Business School student is attending classes.");
            }
        };

        // Use the anonymous class object
        businessStudent.study();
        businessStudent.attendClasses();
    }
}

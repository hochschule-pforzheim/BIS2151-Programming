package unit09.lecture;

/**
 * The StudentManagement class demonstrates the creation and usage of various
 * student objects, including those extending the abstract Student class and
 * implementing the StudentComitee interface.
 *
 * <p>
 * This class serves as an example of object-oriented programming concepts such
 * as inheritance, polymorphism, and interface implementation.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public class StudentManagement
{

    /**
     * The run method serves as the entry point of the package. It creates
     * instances of different types of students, calls their methods, and
     * demonstrates polymorphism and interface usage.
     *
     */
    public static void run()
    {
        // Polymorphism: A PforzheimStudent object is referenced by a Student type variable.
        Student myStudent = new PforzheimStudent("Doe", "John", 300000);
        System.out.println(myStudent.toString());

        // Calls the study method from the Student class (can be overridden in subclasses).
        myStudent.study();

        // Creating a specific PforzheimStudent object.
        PforzheimStudent myPFStudent = new PforzheimStudent("Doe", "Jane", 300001);

        // Creating a KarlsruheStudent object.
        KarlsruheStudent myKAStudent = new KarlsruheStudent("Example", "Third", 53555);

        // Calls the overridden registerExam method for each specific subclass.
        myPFStudent.registerExam();
        myKAStudent.registerExam();
        myStudent.registerExam();

        // Using methods defined in the StudentComitee interface.
        myPFStudent.holdElectection();
        myPFStudent.organiseMeeting();

        // Demonstrating the null assignment of an object reference (makes it eligible for garbage collection).
        myPFStudent = null;

        // This code does not work because abstract classes cannot be directly instantiated.
        // PforzheimStudent errorStudent = new Student("Doe", "Jane", 300001);
    }
}

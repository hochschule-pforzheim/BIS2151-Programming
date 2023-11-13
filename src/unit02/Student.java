package unit02;

/**
 * Possible solution for the constructor task
 *
 * @author Andreas Schneider
 */
public class Student
{

    public Student(String name)
    {
        System.out.println("Student name is: " + name);
    }

    public static void run(String[] args)
    {
        Student myStudent = new Student("John");
    }
}

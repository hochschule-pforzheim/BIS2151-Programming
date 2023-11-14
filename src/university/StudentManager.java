package university;

import java.util.ArrayList;

/**
 * StudentManager for the Lecture
 *
 * @author Andreas Schneider
 */
public class StudentManager
{

    static ArrayList<Student> studentCollection = new ArrayList<>();

    public static void run()
    {
        // Basic Approach
        Student studentOne = new Student();
        studentOne.setPrename("John");
        studentOne.setSurname("Doe");
        // studentOne.study(25);

        // ArrayList Approach
        Student studentTwo = new Student(300000, "Test", "Test");
        studentCollection.add(studentTwo);
        Student studentThree = new Student();
        studentCollection.add(studentThree);
        boolean collectionEmpty = studentCollection.isEmpty();
        System.out.println("Is the ArrayList empty? " + collectionEmpty);
        System.out.println(studentCollection);
    }

    public static void printStudents()
    {
        // extensive approach
        Student tempStudent = studentCollection.get(0);
        System.out.println("Student ID: " + tempStudent.getStudentID());

        // Accessing directly in the ArrayList
        System.out.println("Student ID: " + studentCollection
                .get(0)
                .getStudentID());
    }
}

package unit04;

/**
 * Example Array
 *
 * @author Andreas Schneider
 */
public class ArrayExample
{

    public static void main(String[] args)
    {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing Student objects and adding them to the array
        students[0] = new Student(300000, "Smith", "Alice");
        students[1] = new Student(300001, "Doe", "John");
        students[2] = new Student(300002, "Jackson", "Tom");

        // Accessing and printing student information from the array
        System.out.println("Student 1: Name - " + students[0].getPrename() + " " + students[0].getSurname() + " ID: " + students[0].getStudentID());
        System.out.println("Student 2: Name - " + students[1].getPrename() + " " + students[1].getSurname() + " ID: " + students[1].getStudentID());
        System.out.println("Student 2: Name - " + students[2].getPrename() + " " + students[2].getSurname() + " ID: " + students[2].getStudentID());

    }
}

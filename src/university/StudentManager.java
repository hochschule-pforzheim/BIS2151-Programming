package university;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void printOutAllStudents()
    {
        for (Student currentStudent : studentCollection) {
            System.out.println("Student Surname: " + currentStudent.getSurname());
            System.out.println("Student ID: " + currentStudent.getStudentID());
        }

        for (int i = 0; i < studentCollection.size(); i++) {
            System.out.println("Student Surname: "
                    + studentCollection.get(i)
                            .getSurname());
            System.out.println("Student ID: "
                    + studentCollection.get(i)
                            .getStudentID());
        }
    }

    public static void printSpecificStudent(int studentID)
    {
        try {
            // Local Copy Approach
            Student tempStudent = studentCollection.get(studentID);
            System.out.println("Surname: " + tempStudent.getSurname());
            System.out.println("Prename: " + tempStudent.getPrename());

            // All-In-One Approach
            System.out.println("Surname: "
                    + studentCollection
                            .get(studentID)
                            .getSurname());

            System.out.println("Prename: "
                    + studentCollection
                            .get(studentID)
                            .getPrename());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

        }

    }

    public static void errorStudentException(int studentID)
    {
        Student tempStudent = studentCollection.get(studentID);
        System.out.println("Surname: " + tempStudent.getSurname());
        System.out.println("Prename: " + tempStudent.getPrename());

    }

    public static void helloStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats your name? ");
        String userInput = sc.nextLine();
        System.out.println("Hello " + userInput + "!");
        System.out.print("Whats the price of a mensa food? ");
        try {
            int mensaPrice = sc.nextInt();
            System.out.println("Okay, thanks! The price is: " + mensaPrice);
        } catch (Exception ex) {
            System.out.println("this is not a correct input!");
        }

    }
}

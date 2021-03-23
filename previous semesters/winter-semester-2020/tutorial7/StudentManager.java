package tutorial7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andi
 */
public class StudentManager
{

    private static final ArrayList<Student> STUDENTS = new ArrayList<>();

    public static void main(String[] args)
    {
        mainMenu();
    }

    private static void mainMenu()
    {
        System.out.println("Welcome to the student manager. Please select any function:");
        System.out.println("(1) Create Student");
        System.out.println("(2) Read Student");
        System.out.println("(3) Update Student");
        System.out.println("(4) Delete Student");

        Scanner sc = new Scanner(System.in);

        int input = 0;
        while (input <= 0 || input > 4)
        {
            try
            {
                input = sc.nextInt();
            } catch (NumberFormatException nfe)
            {
                System.out.println("Your Input is not a number");
            }
        }

        switch (input)
        {
            case 1:
                createStudent();
                break;

            case 2:
                readStudent();
                break;

            case 3:
                updateStudent();
                break;

            case 4:
                deleteStudent();
                break;

            default:
                // begin the loop menu
                break;
        }

    }

    private static void createStudent()
    {
        STUDENTS.add(new Student("Doe", "Joe", 321321, "BDEM"));
        System.out.println("Student created.");
        mainMenu();
    }

    private static void readStudent()
    {
        System.out.println("Student List:");
        for (Student current : STUDENTS)
        {
            System.out.println(current.getStudentID() + " " + current.getName() + " " + current.getSurname());
        }
    }

    private static void updateStudent()
    {
        Scanner sc = new Scanner(System.in);
        int index = 0, userInput = 0;
        try
        {
            userInput = sc.nextInt();
        } catch (NumberFormatException nfe)
        {
            System.out.println("Your Input is not a number");
        }

        for (int i = 0; i < STUDENTS.size(); i++)
        {
            if (STUDENTS.get(i).getStudentID() == (userInput))
            {
                index = i;
            }

        }
        // user Input for the attributes
        Student temporary = STUDENTS.get(index);
        temporary.setName("Random Input");
        temporary.setSurname("Random Input II");
        temporary.setCourseOfStudies("Input III");
        STUDENTS.set(index, temporary);
    }

    private static void deleteStudent()
    {
        Scanner sc = new Scanner(System.in);
        int index = 0, userInput = 0;
        try
        {
            userInput = sc.nextInt();
        } catch (NumberFormatException nfe)
        {
            System.out.println("Your Input is not a number");
        }

        for (int i = 0; i < STUDENTS.size(); i++)
        {
            if (STUDENTS.get(i).getStudentID() == (userInput))
            {
                index = i;
                break;
            }

        }
        STUDENTS.remove(index);
    }
}

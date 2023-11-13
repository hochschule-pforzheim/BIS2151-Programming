package unit05;

import university.Student;

/**
 * Example Array Problems
 *
 * @author Andreas Schneider
 */
public class StudentStorage
{

    public static void run()
    {
        Student studentOne = new Student(300000, "Smith", "Alice");
        Student studentTwo = new Student(300001, "Doe", "John");
        Student studentThree = new Student(300002, "Jackson", "Tom");

        Student[] myStudents = {studentOne, studentTwo, studentThree};

        Student studentFour = new Student(300003, "Ross", "Tina");
        // This will throw a ArrayIndexOutOfBoundsException:
        // myStudents[3] = studentFour;
    }

}

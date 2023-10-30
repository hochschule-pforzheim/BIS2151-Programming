package unit04;

import java.util.Date;

/**
 * Example Student class for unit04
 *
 * @author Andreas Schneider
 */
public class Student
{

    private int studentID;
    public String surname;
    public String prename;
    public Date birthdate;
    private int actualSemester;
    public char state;

    public void study(int hoursOfStudy)
    {
        System.out.println("Studying ...");
        hoursOfStudy = hoursOfStudy - 1;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public Student()
    {
        // This is the null/default constructor
    }

    public Student(int studentID, String surname, String prename)
    {
        this.studentID = studentID;
        this.surname = surname;
        this.prename = prename;
    }

}

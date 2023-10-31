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
    private String surname;
    private String prename;
    public Date birthdate;
    private int actualSemester;
    public char state;

    public void study(int hoursOfStudy)
    {
        System.out.println("Studying ...");
        hoursOfStudy = hoursOfStudy - 1;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPrename()
    {
        return prename;
    }

    public void setPrename(String prename)
    {
        this.prename = prename;
    }

    public int getActualSemester()
    {
        return actualSemester;
    }

    public void setActualSemester(int newSemester)
    {
        this.actualSemester = newSemester;
    }

    public void nextSemester()
    {
        this.actualSemester++;
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

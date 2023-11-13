package university;

import java.util.Date;

/**
 * Example Student Class for the Lecture
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

    public Student(int studentID, String surname, String prename, Date birthdate, int actualSemester, char state)
    {
        this.studentID = studentID;
        this.surname = surname;
        this.prename = prename;
        this.birthdate = birthdate;
        this.actualSemester = actualSemester;
        this.state = state;
    }

    @Override
    public String toString()
    {
        return "Student{"
                + "surname='" + this.surname + '\''
                + "prename='" + this.prename + '\''
                + ", semester=" + this.actualSemester
                + ", studentID=" + this.studentID
                + '}';
    }
}

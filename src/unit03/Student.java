package unit03;

import java.util.Date;

/**
 * Possible solution for Exercise 1
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

    public int getStudentID()
    {
        return studentID;
    }

    public int getActualSemester()
    {
        return actualSemester;
    }

    public void setActualSemester(int newActualSemester)
    {
        this.actualSemester = newActualSemester;
    }

    void goAbroad()
    {
        this.state = 'a';
    }

    void goVacation()
    {
        this.state = 'v';
    }

    void setRegular()
    {
        this.state = 'r';
    }

    void nextSemester()
    {
        int newSemester = getActualSemester();
        newSemester++;
        setActualSemester(newSemester);
    }

    // Possible solution for this override
    @Override
    public String toString()
    {
        return "Student{"
                + "studentID=" + studentID
                + ", surname='" + surname + '\''
                + ", prename='" + prename + '\''
                + ", birthdate=" + birthdate
                + ", actualSemester=" + actualSemester
                + ", state=" + state
                + '}';
    }
}

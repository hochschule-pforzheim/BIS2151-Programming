package samples;

/**
 *
 * @author Prof. Werner Burkard
 */
public class Student
{

    private static int numberOfStudents;

    public static int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    private String prename;
    private String surname;
    private char state; // R=regular, I=internship, V=vacation, A=abroad
    // current Semester 1-30: student is immatriculated
    // currentSemester  100+ x : student concluded successfully in semester x
    // curentSemester  -100- x : student failed after semester x
    private int currentSemester;
    private boolean european; // true, if it is an european citizen

    public char getState()
    {
        return state;
    }

    public void setState(char state)
    {
        this.state = state;
    }

    public int getCurrentSemester()
    {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester)
    {
        this.currentSemester = currentSemester;
    }

    public boolean isEuropean()
    {
        return european;
    }

    public void setEuropean(boolean european)
    {
        this.european = european;
    }

    // Constructors
    public Student()
    {
        // this is the default constructor
        this("Max", "Mustermann", 'R', 1, true);
    }

    public Student(String prename, String surname, char state, int currentSemester, boolean european)
    {
        this.prename = prename;
        this.surname = surname;
        this.state = state;
        this.currentSemester = currentSemester;
        this.european = european;

        numberOfStudents++;  // we have one student more!
    }

    // getter and setter methods
    public String getPrename()
    {
        return prename;
    }

    public void setPrename(String prename)
    {
        if (!prename.equals("John Jackson"))
        {
            this.prename = prename;
        }
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int nextSemester()
    {
        // switches the student to the next semester
        if (state != 'V')
        {
            ++currentSemester;
        }
        return currentSemester;
    }

    public char goInternship()
    {
        state = 'I';
        // alternative way:
        this.setState('I');
        return state;
    }

    public void successfulConclusion()
    {
        if (currentSemester < 100 && currentSemester > 0)
        {
            currentSemester = 100 + currentSemester;
        }
    }

    public void failedConclusion()
    {
        if (currentSemester < 100 && currentSemester > 0)
        {
            currentSemester = -100 - currentSemester;
        }
    }

    @Override
    public String toString()
    {
        String me;
        me = prename + " " + surname + " (actual state " + state + ") actual Semester:" + currentSemester;
        if (isEuropean())
        {
            me = me + " (European)";
        }
        else
        {
            me = me + " (from abroad)";
        }
        return me;
    }
}

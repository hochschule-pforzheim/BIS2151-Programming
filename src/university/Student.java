package university;

/**
 * Example Student Class for the Lecture
 *
 * @author Andreas Schneider
 */
public class Student
{

    public static int studentCounter;
    private int studentID;
    private String surname, prename;
    private String courseOfStudies;
    private byte actualSemester;
    private double averageGrading;

    public Student()
    {
        // Default constructor
        System.out.println("Using the default constructor.");
    }

    public Student(int studentID, String surname, String prename)
    {
        this.studentID = studentID;
        this.surname = surname;
        this.prename = prename;
    }

    public Student(int studentID, String surname, String prename, byte actualSemester)
    {
        this.studentID = studentID;
        this.surname = surname;
        this.prename = prename;
        this.actualSemester = actualSemester;
    }

    public void study(int hoursOfStudy)
    {
        if (hoursOfStudy < 25) {
            for (int x = hoursOfStudy; x >= 0; x--) {
                if (x == 0) {
                    System.out.println("Finished studying.");
                } else if (x == 1) {
                    System.out.println("Studying ... " + x + " hour to go.");
                } else {
                    System.out.println("Studying ... " + x + " hours to go.");
                }

            }
        } else {
            System.out.println("You are crazy studying more than a day in a row!");
        }

    }

    public String getPrename()
    {
        return prename;
    }

    public void setPrename(String prename)
    {
        this.prename = prename;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public byte getActualSemester()
    {
        return actualSemester;
    }

    public void setActualSemester(byte actualSemester)
    {
        this.actualSemester = actualSemester;
    }

    public String getCourseOfStudies()
    {
        return courseOfStudies;
    }

    public void setCourseOfStudies(String courseOfStudies)
    {
        this.courseOfStudies = courseOfStudies;
    }

    public double getAverageGrading()
    {
        return averageGrading;
    }

    public void setAverageGrading(double averageGrading)
    {
        this.averageGrading = averageGrading;
    }

}

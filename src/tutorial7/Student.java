package tutorial7;

/**
 * Sample solution for a student
 *
 * @author ainzone
 */
public class Student
{

    private String surname, name, courseOfStudies;
    private final int STUDENT_ID;
    private static int counter = 1;

    /**
     * Creates a Student with the required parameters.
     *
     * @param surname
     * @param name
     * @param matriculationNumber
     * @param courseOfStudies
     */
    public Student(String surname, String name, int matriculationNumber, String courseOfStudies)
    {
        this.STUDENT_ID = counter;
        this.surname = surname;
        this.name = name;
        this.courseOfStudies = courseOfStudies;
        counter++;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCourseOfStudies()
    {
        return courseOfStudies;
    }

    public void setCourseOfStudies(String courseOfStudies)
    {
        this.courseOfStudies = courseOfStudies;
    }

    public int getStudentID()
    {
        return STUDENT_ID;
    }

}

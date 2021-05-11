package tutorial07;

/**
 * Describes an object of type Student
 *
 * @author Andreas Schneider
 */
public class Student
{

    private String surname;
    private String name;
    private int matriculationNumber;
    private String CourseOfStudies;

    public Student(String surname, String name, int matriculationNumber, String CourseOfStudies)
    {
        this.surname = surname;
        this.name = name;
        this.matriculationNumber = matriculationNumber;
        this.CourseOfStudies = CourseOfStudies;
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

    public int getMatriculationNumber()
    {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber)
    {
        this.matriculationNumber = matriculationNumber;
    }

    public String getCourseOfStudies()
    {
        return CourseOfStudies;
    }

    public void setCourseOfStudies(String CourseOfStudies)
    {
        this.CourseOfStudies = CourseOfStudies;
    }

    public void printInformation()
    {
        System.out.println("Student: "
                + this.name
                + " "
                + this.surname
                + " has the MatrNr. "
                + this.matriculationNumber
                + " and studies in "
                + this.CourseOfStudies);
    }
}

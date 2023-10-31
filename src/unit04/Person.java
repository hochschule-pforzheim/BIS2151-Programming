package unit04;

/**
 * Example Class Person for the lecture.
 *
 * @author Andreas Schneider
 */
public class Person
{

    public String prename, surname;

    public Person()
    {
        // This is the default/null constructor
    }

    public Person(String prename, String surname)
    {
        this.prename = prename;
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

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

}

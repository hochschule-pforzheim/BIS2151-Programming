package serialization;

import java.io.Serializable;

/**
 * @version 1.0
 * @author ainzone
 */
public class Participant implements Serializable
{

    private String name;
    private String surname;
    private int age;

    /**
     * Creates a participant with a name, a surname and an age
     *
     * @param name
     * @param surname
     * @param age
     */
    public Participant(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " " + surname + " (" + age + ")";
    }
}

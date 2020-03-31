package tutorial;
/**
 * Tutorial 31.03.2020
 * @author Andreas Schneider
 * @version 1.0
 */
public class Student 
{ 
    private String name;
    private String surname;
    
    public Student()
    {
        // this is an example for a default constructor.
    }
    public Student(String surname)
    {
        this.surname = surname;
    }
    
    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name.equals("John Jackson"))
        {
           this.name = name; 
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
}



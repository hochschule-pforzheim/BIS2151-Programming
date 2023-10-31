package unit04;

public class Person
{
    public String prename, surname;

    public Person()
    {
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

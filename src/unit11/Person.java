package unit11;

import java.io.Serializable;

/**
 * Example of a serializable class
 *
 * @author Andreas Schneider
 */
class Person implements Serializable
{
    // This helps in versioning during deserialization
    private static final long serialVersionUID = 1L; 
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

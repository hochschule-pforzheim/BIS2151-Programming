package tutorial6;

import java.util.ArrayList;

/**
 * A manager class for using ArrayLists
 *
 * @author ainzone
 */
public class ArrayListManager
{

    public static void main(String[] args)
    {
        ArrayList<Student> StudentsArray = new ArrayList<>();
        Student John = new Student("Doe", "John", 310000, "BDEM");
        Student Jane = new Student("Doe", "Jane", 310001, "BDEM");

        StudentsArray.add(John);
        StudentsArray.add(Jane);
        System.out.println(StudentsArray);

        ArrayList<String> CarBrands = new ArrayList<>();
        CarBrands.add("Mercedes-Benz");
        CarBrands.add("BMW");
        CarBrands.add("Volkswagen");
        CarBrands.add("Audi");

        System.out.println(CarBrands);

        // show all car brands
        for (int i = 0; i < CarBrands.size(); i++)
        {
            System.out.println(CarBrands.get(i));
        }

        // for each element show the name + "NEW"
        for (String current : CarBrands)
        {
            System.out.println(current + " NEW");
        }

        // for each element show name + surname
        for (Student current : StudentsArray)
        {
            System.out.println(current.getName() + " " + current.getSurname());
        }
    }
}

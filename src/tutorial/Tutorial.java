package tutorial;

import testat0.Student;

/**
 * Tutorial BIS2151
 * @author ainzone
 * @version 1.1
 */
public class Tutorial
{
    public static void main(String []args) 
    {
        // creating objects
        Student firstStudent = new Student ("John", "Doe", 'R', 1, true); 
        Student secondStudent = new Student ();
        
        // using get and set methods
        System.out.println(firstStudent.getPrename() + " " + firstStudent.getSurname());
        firstStudent.setPrename("John Jackson");
        System.out.println(firstStudent.getPrename() + " " + firstStudent.getSurname());
       
        // try-catch conversion test
        String input = "123";
        conversion(input);
        
        // running the code from testat 1   
        testat1.Viruscalculator.run(args);
    }
    
    public static void conversion(String input)
    {
        try
        {
            // conver the string into an int
            int number = Integer.parseInt(input.trim());
            // printing out the result
            System.out.println("The given number was: " + number);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("There was an error " + nfe.getMessage());
        }
    }
}

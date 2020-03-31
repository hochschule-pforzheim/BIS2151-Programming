package tutorial;

/**
 * Tutorial 31.03.2020
 * @author Andreas Schneider
 * @version 1.0
 */
public class Tutorial
{
    public static void main(String []args) 
    {
        // Creating objects
        Student firstStudent = new Student ("John", "Doe"); 
        Student secondStudent = new Student ("Joan");
        
        // using get and set methods
        System.out.println(firstStudent.getName() + " " + firstStudent.getSurname());
        firstStudent.setName("John Jackson");
        System.out.println(firstStudent.getName() + " " + firstStudent.getSurname());
       
        // try-catch conversion test
        String input = "123";
        conversion(input);
    }
    
    public static void conversion(String input)
    {
        try
        {
            // conver the string into an int
            int number = Integer.parseInt(input.trim());
            // Printing out the result
            System.out.println("The given number was: " + number);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("There was an error " + nfe.getMessage());
        }
    }
}

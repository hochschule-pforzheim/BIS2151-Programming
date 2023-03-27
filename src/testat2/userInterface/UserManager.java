/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testat2.userInterface;

import testat2.core.Person;
import testat2.core.PersonManager;
import java.util.Scanner;

/**
 *
 * @author Prof. Werner Burkard (@wernerburkard)
 */
public class UserManager
{

    private PersonManager thePersonManager = new PersonManager(); // Our collegue that manages persons

    private String inputName = "";       //user input: a text for the name
    private String inputWeight = "";     //user input: a text for the weight
    private String inputSize = "";       //user input: a text for the size

    private String name = "";             // a real name
    private int weight = -1;             // a real weight
    private double size = -1.0;          // a real size

    void takeInput(String[] args)
    {

        if (args.length >= 1)
        { // we have at least 1 parameter (should be the name)
            inputName = args[0];  // save it in inputname
        }

        if (args.length >= 2)
        { // we have at least 2 parameters (second should be the name)
            inputWeight = args[1];  // save it in inputWeight
        }

        if (args.length >= 3)
        { // we have at least 3 parameters (third should be the size)
            inputSize = args[2];  // save it in inputSize
        }
    }

    // the main task of the user manager is now to present a main menu for the user
    // User can select to add(1) or delete(2) a person, or to show all persons
    void goMenu()
    {
        int userAnswer;
        String message = "Hello World, this is BMI Calculator Version 4 with menu";
        System.out.println(message);

        while (true)
        {  // do it and do it ... forever
            System.out.println("\r\n\tMAINMENU");
            System.out.println("Please select from this menu");
            System.out.println("add a person        1");
            System.out.println("delete a person     2");
            System.out.println("show all persons    3");
            System.out.println("exit program        0");
            userAnswer = getSelection(0, 3); // get an answer between 0-3
            switch (userAnswer)
            {
                case 0:
                    System.out.println("bye bye");
                    System.exit(0);
                    break;
                case 1:
                    addPerson();
                    break;
                case 2:
                    deletePerson();
                    break;
                case 3:
                    showAllPersons();
                    break;
            }
        }
    }  // end of goMENU()

    //checks if name is okay
    private String checkName(String nameArgument)
    {
        // as long as we have errors in the name, we ask the user for another input
        // whether a name is bad or okay can best be checked by the person manager!
        while (thePersonManager.isBadName(nameArgument))
        {
            if (!nameArgument.isEmpty())
            { // some bad things are in name
                System.out.println("Bad name, please enter a better one!");
            }
            System.out.print("Enter new name: ");
            nameArgument = readKeyboard();
        }
        // Great: User input is now fine as we overcame the loop!
        // We simply delete leading and trailing spaces
        // and return this optimized string to the caller 
        return nameArgument.trim();
    }   // end of method checkName()

    //checks if weight is okay
    private int checkWeight(String aText)
    {
        int theWeight = -1;  // we assume it is  not okay...

        while (theWeight < 0)
        {  // ... and start checking
            if (!aText.isEmpty())
            { // something is inside the text
                try
                {
                    theWeight = Integer.parseInt(aText); // make an integer value
                }
                catch (Exception e)
                { // this is not possible? So handle the exception:
                    System.out.println("Bad caracters in weight!");
                    theWeight = -1;
                }

                // Ask the person manager if the weight is bad
                if (thePersonManager.isBadWeight(theWeight))
                {
                    System.out.println("Weight has bad value (must be 30-250 kg ");
                    theWeight = -1;
                }
            }
            if (theWeight < 0)
            {
                System.out.print("Enter new weight: ");
                aText = readKeyboard();
            }
        }
        // Great: User input is now fine as we overcame the loop!
        // We simply return this checked weight to the caller 
        return theWeight;
    } // end of method checkWeight()

    //checks if size is okay
    private double checkSize(String aText)
    {
        double theSize = -1.0;   // we assume it is  not okay...

        while (theSize < 0)
        {  // ... and start checking
            if (!aText.isEmpty())
            { // something is inside the text
                try
                {
                    theSize = Double.parseDouble(aText); // make a double value from the text
                }
                catch (Exception e)
                { // this is not possible? So handle the exception:
                    System.out.println("Bad caracters in size!");
                    theSize = -1;
                }

                // Ask the person manager if the size is bad
                if (thePersonManager.isBadSize(theSize))
                {
                    System.out.println("Size has bad value (must be 1.25m-2.50m ");
                    theSize = -1;
                }
            }
            if (theSize < 0)
            {
                System.out.print("Enter new size: ");
                aText = readKeyboard();
            }
        }
        // Great: User input is now fine as we overcame the loop!
        // We simply return this checked size to the caller 
        return theSize;
    }   // end of method checkSize()

    private String readKeyboard()
    {
        String input;
        Scanner theKeyboard = new Scanner(System.in);
        input = theKeyboard.nextLine(); // reads one complete line of user input
        // return optimized input: deletes leading + trailing spaces
        return input.trim();
    }

    private boolean userSaysYes()
    {
        String answer = readKeyboard().toUpperCase();
        return answer.startsWith("Y");
    }

    //private boolean userSaysNo() {
    //    return !userSaysYes();
    //}
    private void showAllPersons()
    {
        int counter = 0;
        System.out.println("\r\nList of current persons:");
        for (Person p : thePersonManager.getPersonStore())
        {
            if (p != null)
            {
                System.out.println(p);
                counter++;
            }
        }
        if (counter == 0)
        {
            System.out.println("- no persons in store -");
        }
    }

    // to add persons to the store
    private void addPerson()
    {
        boolean doItAgain = true;
        while (doItAgain)
        {
            System.out.println("\r\n\tMENU TO ADD PERSONS");
            name = checkName(inputName);
            System.out.println("Name accepted: " + name + "\r\n");

            // method CheckWeight returns a valid int value 
            weight = checkWeight(inputWeight);
            System.out.println("Weight accepted: " + weight + "\r\n");

            // method CheckSize returns a valid double value
            size = checkSize(inputSize);
            System.out.println("Size accepted: " + size + "\r\n");

            System.out.println("Name is: " + name);
            System.out.printf("Weight is: %dkg \r\n", weight);
            System.out.printf("Size is: %.2fm \r\n", size);
            System.out.println();

            // Next we call our collegue to make a person with these informations
            Person someone = thePersonManager.addPerson(name, weight, size);

            // In the end we just present that person if all worked fine
            if (someone == null)
            {
                // something went wrong when the person manager tried to allocate such a person
                System.out.println("Person could not be created, sorry!");
            }
            else
            {
                System.out.println("This person was inserted in the store:");
                System.out.println(someone);
            }
            // reset all input for next loop
            inputName = "";
            inputWeight = "";
            inputSize = "";
            System.out.print("\r\nAnother person to add? (Y/N): ");
            doItAgain = userSaysYes();
        }  // end of while - loop
    }

    // to delete persons from the store
    private void deletePerson()
    {
        boolean doItAgain = true;
        Person p;
        int personID;

        while (doItAgain)
        {
            System.out.println("\r\n\tMENU TO DELETE PERSONS");
            showAllPersons();  // present all available persons from the store
            System.out.print("\r\nPlease enter ID of the person to remove: ");
            personID = getSelection(1, 2000000000); // min ID is 1 and max is Big:-)
            // Ask person manager to find this person
            p = thePersonManager.getPerson(personID); //returns null, if person is not in store

            // does it exist, then ask for removing
            if (p != null)
            { // p references indeed an existing person
                System.out.println("Person found is:");
                System.out.println(p);
                System.out.print("Really delete this person? (Y/N): ");
                if (userSaysYes())
                {
                    if (thePersonManager.deletePerson(personID))
                    {
                        // person is removed:
                        System.out.println("Person removed.");
                    }
                    else
                    {
                        System.out.println("Could not remove this person!");
                    }
                }
            }
            else
            { // no such person in store
                System.out.println("Sorry, such a person is not in store!");
            }
            System.out.print("\r\nAnother person to remove? (Y/N): ");
            doItAgain = userSaysYes();
        }  // end of while - loop    
    }  // end of method deletePerson()

    // read keyboad to get an int between min and max
    private int getSelection(int min, int max)
    {
        int answer = -1;
        while ((answer < min) || (answer > max))
        {
            try
            {
                System.out.print("Your choice: ");
                answer = Integer.parseInt(readKeyboard());
            }
            catch (Exception e)
            {
                answer = -1;
            }
        }
        return answer;
    }
}

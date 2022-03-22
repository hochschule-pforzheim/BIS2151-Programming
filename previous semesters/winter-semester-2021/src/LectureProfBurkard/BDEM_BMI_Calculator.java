/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LectureProfBurkard;

import java.util.Scanner;

/**
 * Here we will program an app that calculates the Body Mass Index of a person
 *
 * @author werner.burkard
 */
public class BDEM_BMI_Calculator {

    /**
     * @param args the command line arguments
     *
     * if there is no argument, we will will ask the user for input if there is
     * 1 argument, this is the persons name if ther is a second argument, this
     * is the persons weight if there is a third argument, this is the persons
     * size
     *
     * And if an argument is missing, we will aks the user for input
     *
     */
    public static void main(String[] args) {
        String name = "";  // persons name
        int weight = 0;    // persons weight
        double size = 0.0; // persons size
        double bmi = 0.0;  // the persons BMI we have to calculate;

        // now let us load these variables from input arguments if possible
        if (args.length >= 1) {
            // great: We have at least the persons name (first arg)
            name = args[0];
        }

        if (args.length >= 2) {
            // great: We have also the persons weight (second arg)
            try {
                weight = Integer.parseInt(args[1]); //Try to convert the String in args[1] in an int value
            } catch (Exception e) {
                System.out.println("Sorry: " + args[1] + " is not an acceptable weight!");
                weight = 0;
            }
        }

        if (args.length >= 3) {
            // great: We have also the persons size (third arg)
            try {
                size = Double.parseDouble(args[2]); //Try to convert the String in args[1] in a double value
            } catch (Exception e) {
                System.out.println("Sorry: " + args[2] + " is not an acceptable size!");
                size = 0;
            }
        }
        // Now we have gathered all input data from args
        // Let us show the actual values

        System.out.println("Person is:" + name + ":");
        System.out.println("Weight is: " + weight);
        System.out.println("Size is: " + size);

        //We have to check the variables for missing or crazy values
        name = checkPerson(name);  // checks if persons name is okay
        weight = checkWeight(weight);  // checks if persons weight is okay
        size = checkSize(size);  // checks if persons size is okay

        System.out.println("Checked arguments are:");
        System.out.println("Person is:" + name + ":");
        System.out.println("Weight is: " + weight);
        System.out.println("Size is: " + size);
        
        // now we calculate the bmi fromm these values:
        bmi = weight / (size * size);
        // and as a last step we show the result:
        System.out.println(name+" has a BMI of: "+bmi+ " ( with weight="+weight+" and size="+size+")");
        
    }  // end of main

    public static String checkPerson(String theName) {
        // Let us first build an object that will be able to read the computers keyboard
        // That'why we call this object simply 'keyboard' :-)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The name we have have to check is " + theName);
        //First we delete leading and trailing spaces
        theName = theName.trim();
        // As long as the name has less than 2 characters we force the user to give us an acceptable name
        while (theName.length() < 2) {  // again: less than 2 letters are not okay!
            System.out.println("Please enter correct persons name (Minimum 2 letters)");
            // read input from keyboard
            theName = keyboard.next(); // read one line from the keyboard (Cursor waits for users input up to the final ENTER key
            theName = theName.trim();  // delete leading and trailing spaces from users input
        }
        return theName;
    }
    
    public static int checkWeight(int theWeight) {
        Scanner keyboard = new Scanner(System.in);
        String input="";
        System.out.println("The weight we have have to check is " + theWeight);
        //Accepted weight must be over 30 and under 300 kg
        while (theWeight < 30 || theWeight > 300) {  // less than 30 or over 300?--> Bad!
            System.out.println("Please enter correct persons weight");
            // read input from keyboard
            input = keyboard.next().trim(); // read one line from the keyboard
            try {
                theWeight = Integer.parseInt(input);
            } catch (Exception e) {
                theWeight = 0;
            }
        }
        return theWeight;
    }
    
    public static double checkSize(double theSize) {
        Scanner keyboard = new Scanner(System.in);
        String input="";
        System.out.println("The size we have have to check is " + theSize);
        //Accepted size must be over 1.30 and under 2.50m
        while (theSize < 1.30 || theSize > 2.50) {  // size lower 1.30 or over 2.50?--> Bad!
            System.out.println("Please enter correct persons size");
            // read input from keyboard
            input = keyboard.next().trim(); // read one line from the keyboard
            try {
                theSize = Double.parseDouble(input);
            } catch (Exception e) {
                theSize = 0.0;
            }
        }
        return theSize;
    }
}

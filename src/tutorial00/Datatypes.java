/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial00;

import java.util.Scanner;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaring two variables of the primitive datatype Integer
        int num1 = 42;
        int num2 = 43;

        //double sum = x + y;
        //System.out.println("x: " + x + " y: " + y + " sum: " + sum);
        
        // Using our addNumbers() method, to add the 2 numbers entered as arguments -> In this case num1 & num 2
        int sumNums = addNumbers(num1, num2);

        // Print out the sum of those numbers, which was stored in the variable sumNums
        System.out.println(sumNums);
        System.out.println("Sum: " + sumNums);

        // Create an Object of type Scanner and entering "System.in" as the argument
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number x: ");
        // Read the next Line of Input from the User and save it in the String variable inputX
        String inputX = keyboard.nextLine();

        System.out.println("Enter number y: ");
        String inputY = keyboard.nextLine();

        int x = 10;
        int y = 0;
        
        // Exception-Handling
        try { // Try to parse the User input in to an Integer variable
            x = Integer.parseInt(inputX);
        } catch (Exception e) { // If there is any Exception we tell the User:
            System.out.println("Only enter numbers!");
        }

        try {
            y = Integer.parseInt(inputY);
        } catch (NumberFormatException e) { // If there is especially a NumberFormatException we tell the User:
            System.out.println("Only enter numbers!");
        }

        if (y == x) { // If condition is equal (==) to true, we print out, that the numbers are equal
            System.out.println("X is equal to Y");
        } else { // If that isn't the case, then that means they're not equal
            System.out.println("X isn't equal to Y");
        }

        int sum = addNumbers(x, y);

        System.out.println(inputX + " " + inputY);
        // The Sum of the entered numbers
        System.out.println("Sum = " + sum);
    }

    // modifier: private static; return type: int; name: addNumbers; Parameters: int x, int y
    private static int addNumbers(int x, int y) {
        int sum = x + y;

        return sum;
    }
}

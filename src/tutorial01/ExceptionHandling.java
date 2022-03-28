/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial01;

import java.util.Scanner;

/**
 *
 * @author Jascha Pfäfflin
 */
public class ExceptionHandling {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //boolean validInput = false;
        int num = 0;

        Scanner keyboard = new Scanner(System.in);
        
        
        // Unendliche Schleife, aus der man mit "break" rauskommt
        while (true) {
            System.out.print("Bitte Zahl eingeben: ");
            String theNum = keyboard.nextLine();

            try {
                num = Integer.parseInt(theNum);
                if (num < 0) {
                    System.out.println("Die Zahl muss größer als 0 sein");
                    continue; // Input ist zwar eine Zahl, jedoch ist die Zahl kleiner als 0 -> Fange die Schleife von vorne an!
                } else {
                    break; // Input ist eine Zahl, die größer als 0 ist -> Brech aus der Schleife aus!
                }
            } catch (NumberFormatException exception) {
                System.out.println("Der eingebene Input ist keine Zahl");
                continue; // Input ist keine Zahl
            }            
        }
        
                    // Durch das Parsen kann nun mit der eingegeben Zahl kalkuliert werden
                    double price = num * 1.19;
                    System.out.println("Der Preis ist: " + price);
                    System.out.println(price + " €");

    }

}

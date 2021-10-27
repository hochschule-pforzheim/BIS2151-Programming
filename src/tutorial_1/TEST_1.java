/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial_1;

/**
 *
 * @author Jonathan Hinkel
 */
public class TEST_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(args[3]); 
        int number = 15; 
        boolean isEven = calculateResult(number); 
        if(isEven == true) {
            System.out.println("The number is even."); 
        } else {
            System.out.println("The number is odd."); 
        }
    }
    
    /**
     * This method determines whether a number is odd or even.
     * @param input the number to be evaluated 
     * @return true if the number is even, odd if it's uneven 
     */
    public static boolean calculateResult(int input) {
        int result = input % 2;
        return result == 0; 
    }
}

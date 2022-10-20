/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial00;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 0;
        int b = 0;
        int[] nums = {0, 1, 2};

        // while loop: Checks the condition, before executing
        while (a != 0 && a < 3) {
            System.out.println("Value of a: " + a);
            a++;
        }

        System.out.println("---------------------");

        // do-while loop: Executes one time before checking the condition
        do {
            System.out.println("Value of b: " + b);
            b++;
        } while (b != 0 && b < 3);

        System.out.println("---------------------");

        /* for loop:
        Statement 1 is executed (one time) before the execution of the code block
        Statement 2 defines the condition for executing the code block
        Statement 3 is executed (every time) after the code block has been executed
         */
        for (int c = 0; c < 3; c++) {
            System.out.println("Value of c: " + c);
        }

        System.out.println("---------------------");

        // for-each loop: loops through all elements of an array
        for (int d : nums) {
            System.out.println("Value of d: " + d);
        }
    }

}

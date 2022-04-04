/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial02;

/**
 *
 * @author Jascha Pfäfflin
 * 
 * pre- and post-incremet example
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0; // x wird post-incremented
        int y = 0; // y wird pre-incremented

        // post-increment
        System.out.println("X: " + x++);
        System.out.println("X: " + x);

        // pre-increment
        System.out.println("Y: " + ++y);
        System.out.println("Y: " + y);
    }

}

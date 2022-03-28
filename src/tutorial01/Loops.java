/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial01;

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

        /*
        Unterschiede können vorallem zwischen den Schleifen while, for zu der Schleife do-while
        offensichtlich gemacht werden.
        Tauscht man die Kondition von "< 3" zu "< 0" läuft die do-while Schleife einmal ab,
        im Gegensatz zu den anderen Beiden
         */
        int a = 0;
        int b = 0;
        int c = 0;
        //int test = 5;

        // post - increment
        System.out.println(a++);
        System.out.println(a);

        // pre - increment 
        System.out.println(++a);

        System.out.println("--------------------");

        // while loop: Checkt die Kondition vor dem Ablaufen des Bodys
        while (b < 3) {
            System.out.println("b: " + b);
            b++;

            //test = 6;
        }

        //System.out.println(test);
        // do-while loop: Läuft einmal ab bevor die Kondition gecheckt wurde
        do {
            System.out.println("c: " + c);
            c++;
        } while (c < 3);

        /* for loop:
        Statement 1 läuft einmal ab, bevor der Schleifen Body abläuft
        Statement 2 definiert die Kondition für das Ablaufne des SChleifen Bodys
        Statement 3 läuft jedes mal ab, nachdem der Schleifen Body einmal abgelaufen ist
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("i " + i);
        }

    }

}

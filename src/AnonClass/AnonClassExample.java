/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnonClass;

/**
 *
 * @author Jonathan Hinkel
 */
public class AnonClassExample {
    public static void main(String[] args) {
        //var anon = new AnonClass("Example");
        var anonEx = new AnonClass("Example") {
            public int print() {
                float l = 100; 
                int i = 5; 
                return (int) l + i;
            }
            
            @Override
            public String toString() {
                return "Extended AnonClass => " + this.value; 
            }
        }; 
        //System.out.println(anon);
        System.out.println(anonEx);
    }
}

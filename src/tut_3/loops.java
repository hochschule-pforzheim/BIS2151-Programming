/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tut_3;

/**
 *
 * @author Jonathan Hinkel
 */
public class loops {
    public static void main(String[] args) {
        int howManyTimes = 10;
        int i = 0; 
        while(i <= howManyTimes) {
            System.out.println(i);
            i++;
        }
        
        
        System.out.println("Another way:");
        while(howManyTimes >= 1) {
            System.out.println(howManyTimes);
            howManyTimes--;
        }
    }
}

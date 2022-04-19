/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jascha Pfäfflin
 */
public class DateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date expireDate = new Date();
        System.out.println(expireDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println(sdf.format(expireDate));

        Calendar clr = Calendar.getInstance();

        clr.set(2048, Calendar.JULY, 5);
        expireDate = clr.getTime();
        System.out.println(sdf.format(expireDate));
        
       
            System.out.print("Enter the Date the Note should expire (dd.MM.yyyy): ");
            String expireDateSt = keyboard.nextLine();
            try {
                expireDate = sdf.parse(expireDateSt);
                if (expireDate.before(new Date())) {
                    System.out.println("The Date on which the Note expires can only be after today!");
                }
                System.out.println(sdf.format(expireDate));
            } catch (ParseException e) {
                System.out.println("Please enter the Date in the following format: dd.MM.yyyy");
            }
                        
        }
    }

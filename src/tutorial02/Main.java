/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial02;

import tutorial03.Stauts;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Studierende werden erstellt
        Student s = new Student("Jascha" , "Pfäfflin", "BWMI");
        Student s2 = new Student("Linus" , "Rode", "BDEM");
        Student s3 = new Student("Sandra" , "Nguyen", "BDEM");
        Student s1 = new Student(); // -> Default Constructor
        
        //s.matrikelnr  = 323400;
        
        System.out.println("Matrikelnr: " + s.getMatrikelnr() + " Vorname: " + s.getVorname());
        System.out.println("Matrikelnr: " + s2.getMatrikelnr() + " Vorname: " + s2.getVorname());
        System.out.println("Matrikelnr: " + s3.getMatrikelnr() + " Vorname: " + s3.getVorname());
        
        // Hat beides den gleichen Output
        System.out.println(s.toString());
        System.out.println(s);
        
        //s1.vorname = "Jascha";
        s1.setVorname("Sandra");
        
        s1.setState(Stauts.IMPORTANT);
        
        //s.setMatrikelnr(323460);
        //s.setMatrikelnr((s.getMatrikelnr() + 1));
        
        //System.out.println(s1.getVorname());
        //System.out.println("S Martrikelnr: " + s.getMatrikelnr());
    }
    
}

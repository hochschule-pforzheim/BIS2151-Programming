/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

import java.util.ArrayList;

/**
 *
 * @author Pfäfflin
 */
public class StudentManager {

    private static StudentManager theStudentManager; // Kein "new" -> Am Anfang = null

    public ArrayList<Student> studentList = new ArrayList<>();

    private StudentManager() {

    }

    /**
     * Singleton: verhindert, dass mehrere Objekte vom Typ StudentManager
     * erzeugt werden können. Durch {@code getInstance()} wird, falls noch keine
     * Referenz für {@code  theStudentManager} besteht, ein neues Objekt erzeugt,
     * sonst wird nur die Referenz übergeben.
     *
     * @return
     */
    public static StudentManager getInstance() {
        if (theStudentManager == null) {
            theStudentManager = new StudentManager();
        }
        return theStudentManager;
    }

}

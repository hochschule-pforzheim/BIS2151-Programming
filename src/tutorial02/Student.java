/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial02;

import java.util.Date;
import tutorial03.Status;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Student {

    private int matrikelnr;
    private String vorname;
    private String nachname;
    private String studiengang;
    private static int counter = 0; // statisch und damit Teil der Klasse, unabhängig zum Objekt
    private Status state;

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    /**
     * Eigenerstellter Konstruktor (="Unique Constructor"), wenn ein
     * Studierender erstellt werden soll
     *
     * @param vorname des Studierendens
     * @param nachname des Studierendens
     * @param studiengang des Studierendens
     */
    public Student(String vorname, String nachname, String studiengang) {
        counter++; // post-increment 
        this.matrikelnr = counter;
        this.vorname = vorname;
        this.nachname = nachname;
        this.studiengang = studiengang;
    }

    public Student() {
        // Automatisch generirert ="Default Constructor"
    }

    public int getMatrikelnr() {
        return this.matrikelnr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void setMatrikelnr(int x) {
        this.matrikelnr = x;
    }

    /**
     * Überschreiben der toString() Methode, damit wir eine schönere Ausgabe
     * haben, wenn wir nur ein Objekt vom Typ Student aus printen
     *
     * @return alle Informationen zum Studierenden
     */
    @Override
    public String toString() {
        return "Student" + "matrikelnr=" + matrikelnr + ", vorname=" + vorname + ", nachname=" + nachname + ", studiengang=" + studiengang;
    }

}

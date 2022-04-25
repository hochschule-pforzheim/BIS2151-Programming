/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

import tutorial03.Status;

/**
 *
 * @author Pfäfflin
 */
public class Student {

    private int matNr;
    private Status state; // see package tutorial03 enum Status
    private String name;
    private int semester;

    public Student(int matNr, Status state, String name, int semester) {
        this.matNr = matNr;
        this.state = state;
        this.name = name;
        this.semester = semester;
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    
    @Override
    public String toString() {
        return "Student mit matNr: " + matNr + " hat Status: " + state + ", hat den Namen:" + name + ",  ist im Semester:" + semester;
    }

}

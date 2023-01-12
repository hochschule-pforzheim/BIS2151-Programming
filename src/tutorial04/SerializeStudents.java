/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial04;

/**
 *
 * @author jasch
 */
public class SerializeStudents {

    private static StudentManager theStudentManager = StudentManager.getInstance();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //theStudentManager.readList();
        
        Student s = new Student("Oliver", "Kain");
        theStudentManager.addStudent(s);
        //Student s1 = new Student("Jascha", "Pfäfflin");
        //theStudentManager.addStudent(s1);

        theStudentManager.printList();
        theStudentManager.saveList();
    }

    /**
     * Example Constructor -> Use this code in the JFrame Constructor
     */
    public SerializeStudents() {
        //readSettings() ...
        // initComponents()
        // private int final VERSIONNUMBER = 0;
        // 0 = Version number / 1 = Title / 2 = Text
        // String versionNumber = settingsList.get(VERSIONNUMBER);
        // versionNumberLabel.setText(versionNumber);
        
        // this.setTitle(settingsList.get(1));

    }
}

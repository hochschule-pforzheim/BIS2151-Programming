package tutorial04;

import tutorial03.Status;

/**
 *
 * @author Pfäfflin
 */
public class ToStringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println(s);
        //System.out.println("Student mit Namen: " + s.getName());
        //Scanner keyboard = new Scanner(System.in);
        //String name = keyboard.nextLine();
        addStudent();

        // Durch {@code getInstance()} wird auf das gleiche Objekt vom Typ StudentManager referenziert, somit haben wir die gleiche ArrayList
        StudentManager sm = StudentManager.getInstance();

        System.out.println(sm.studentList);
    }

    private static void addStudent() {
        Student s = new Student(323461, Status.URGENT, "Jascha", 4);
        StudentManager sm = StudentManager.getInstance();

        sm.studentList.add(s);
    }

}

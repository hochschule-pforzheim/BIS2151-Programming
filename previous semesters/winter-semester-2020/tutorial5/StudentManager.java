package tutorial5;

/**
 * Sample solution for a student manager class
 *
 * @author ainzone
 */
public class StudentManager
{

    /**
     * The main method starts with creating a sample student and reading data
     * from it.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Student Max = new Student("Mustermann", "Max", 320000, "BDEM");
        readStudent(Max);
    }

    /**
     * Displays all stored data from the given student.
     *
     * @param inputStudent
     */
    public static void readStudent(Student inputStudent)
    {
        System.out.println(inputStudent.getName()
                + " "
                + inputStudent.getSurname()
                + " is a student with the matriculation number "
                + inputStudent.getMatriculationNumber()
                + " and studies "
                + inputStudent.getCourseOfStudies()
                + ".");
    }

    /**
     * Updates the name of the student with the given parameter.
     *
     * @param inputStudent
     * @param newName
     */
    public static void updateStudentName(Student inputStudent, String newName)
    {
        inputStudent.setName(newName);
    }

    /**
     * Setting the reference of the given object to null.
     *
     * @param inputStudent
     */
    public static void deleteStudent(Student inputStudent)
    {
        inputStudent = null;
    }
}

package tutorial07;

/**
 * Manages objects of type Student.
 *
 * @author Andreas Schneider
 */
public class StudentManager
{

    public static void main(String[] args)
    {
        Student studentA = new Student("Doe", "John", 300001, "BWMI");
        Student studentB = new Student("Doe", "Jane", 300002, "BDEM");
        Student studentC = new Student("Bar", "Foo", 300003, "MIS");

        System.out.println(studentC.toString());

        readStudent(studentA);
        // exact the same like
        studentA.printInformation();

        readStudent(studentB);
        readStudent(studentC);

        studentC.setName("Baar");

    }

    public static void readStudent(Student input)
    {
        /*
        ArrayList: search the exact same object and then print the information
         */
        input.printInformation();
    }

    public static void deleteStudent(Student input)
    {
        /*
        ArrayList: Search object and then remove.
         */
        input = null;
        // GC will collect and delete this object.
    }

}

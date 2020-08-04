package testat0;

/**
 * Lecture BIS2151
 *
 * @author wernerburkard
 * @version 1.0
 */
public class StudentTester
{

    public static void main(String[] args)
    {
        int i = 0;
        char c = '?';
        Student s1, s2;

        s1 = new Student();  // Max Mustermann...

        System.out.println("Here I am:");
        System.out.println(s1);
        System.out.println("Number of Students now is " + Student.getNumberOfStudents());

        s2 = new Student("Klara", "Malibu", 'V', 6, false);
        System.out.print("Here I am: ");
        System.out.println(s2);
        System.out.println("Number of Students now is " + Student.getNumberOfStudents());

        if (s1.equals(s2))
        {
            System.out.println("identical");
        }

        s2.setPrename("Miri");
        System.out.println("Hi folks, this is " + s2);
        s2.goInternship();
        s2.nextSemester();
        System.out.println("Hi folks, this is " + s2);
        System.out.println("c is:" + c);
        System.out.println("i is:" + i);
    }

}

package unit04;

/**
 * Example student manager
 *
 * @author Andreas Schneider
 */
public class StudentManager
{

    public static void main(String[] args)
    {
        Student studentOne = new Student();
        studentOne.study(3);

        Student studentTwo = new Student();
        studentTwo.setPrename("Test Two");
        studentTwo.setActualSemester(3);
        studentTwo.nextSemester();

        System.out.println("Student Two's name is: " + studentTwo.getPrename());

        calculateSum(3, 7);
        increment(10);

        // Person Task
        Person alice = new Person();
        alice.setPrename("Alice");
        System.out.println("The Person's name is: " + alice.getPrename());

        Person bob = new Person();
        bob.prename = "Bob";
        System.out.println("Person's two name is: " + bob.prename);
    }

    public static void calculateSum(int a, int b)
    {
        int result = a + b;
        System.out.println(result);
    }

    public static void increment(int num)
    {
        System.out.println("Value before: " + num);
        num++;
        // num = num +1;
        System.out.println("Value after: " + num);
    }

}

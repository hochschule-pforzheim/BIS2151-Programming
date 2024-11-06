package university;

/**
 * Central Class for initiating various methods within the project. This class
 * serves as the entry point for running different modules and exercises in the
 * project, each corresponding to a specific unit or topic.
 *
 * Units and examples are organised by comments, and methods can be individually
 * enabled or disabled as needed.
 *
 * @version 2.0
 * @author Andreas R. Schneider
 */
public class Lecture
{

    public static void main(String[] args)
    {
        // ===== UNIT 4 =====
        // unit04.StudentManager.run();

        // ===== UNIT 5 =====
        // unit05.StudentStorage.run();
        // unit05.WrapperExample.run();
        // unit05.CodingSessionOne.run();
        // unit05.StudentManager.run();
        // ===== UNIT 6 =====
        unit06.University.run();
        unit06.University.sortArrayList();
        unit06.University.roundingExample(99);
        unit06.ExplicitConversion.run();

        // ===== UNIT 7 =====
        // still to be defined.
        // ===== UNIT 8 =====
        // unit08.MakeAnimal.run();
        // ===== UNIT 11 =====
        // unit11.SerializationExample.run();
        // ===== UNIT 12 =====
        // unit12.GreedyApproach.run();
        // unit12.DynamicApproach.run();
        // unit12.KnapsackProblem.run();
        // ===== UNIT 13 =====
        // unit13.DatabaseManager.connect("PostgreSQL");
        // ===== UNIT 14 =====
        // unit14.AnonymousClassExample.run();
        // ===== UNIT 15 =====
        // unit15.TaskThreeComment.run();
        // ===== STUDENT MANAGER =====
        // StudentManager.run();
        // StudentManager.printStudents();
        // StudentManager.printOutAllStudents();
        // StudentManager.printSpecificStudent(0);
        // StudentManager.printSpecificStudent(-3);
        // StudentManager.errorStudentException(-3);
        // StudentManager.helloStudent();
        // ===== EXAM EXAMPLE =====
        // exam.ExamTaskThree.test();
    }
}

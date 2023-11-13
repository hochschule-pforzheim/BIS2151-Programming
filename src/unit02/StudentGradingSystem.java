package unit02;

/**
 * Possible solution for the student grading system task.
 *
 * @author Andreas Schneider
 */
public class StudentGradingSystem
{

    public static void run(String[] args)
    {
        // You can change this score to test different cases
        int score = 85;
        printGradeUsingIf(score);
        printGradeUsingElseIf(score);
        printGradeUsingSwitch(score);
    }

    public static void printGradeUsingIf(int score)
    {
        if (score >= 90 && score <= 100) {
            System.out.println("Using if statement: Student has received grade A.");
        } else if (score >= 80 && score < 90) {
            System.out.println("Using if statement: Student has received grade B.");
        } else if (score >= 70 && score < 80) {
            System.out.println("Using if statement: Student has received grade C.");
        } else if (score >= 60 && score < 70) {
            System.out.println("Using if statement: Student has received grade D.");
        } else if (score >= 0 && score < 60) {
            System.out.println("Using if statement: Student has received grade F.");
        } else {
            System.out.println("Invalid input! Please enter a score between 0 and 100.");
        }
    }

    public static void printGradeUsingElseIf(int score)
    {
        if (score >= 90 && score <= 100) {
            System.out.println("Using else-if statement: Student has received grade A.");
        } else if (score >= 80 && score < 90) {
            System.out.println("Using else-if statement: Student has received grade B.");
        } else if (score >= 70 && score < 80) {
            System.out.println("Using else-if statement: Student has received grade C.");
        } else if (score >= 60 && score < 70) {
            System.out.println("Using else-if statement: Student has received grade D.");
        } else if (score >= 0 && score < 60) {
            System.out.println("Using else-if statement: Student has received grade F.");
        } else {
            System.out.println("Invalid input! Please enter a score between 0 and 100.");
        }
    }

    public static void printGradeUsingSwitch(int score)
    {
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Using switch statement: Student has received grade " + grade + ".");
    }
}

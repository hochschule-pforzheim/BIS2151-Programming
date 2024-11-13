package unit07;

/**
 *
 * @author Andreas R. Schneider
 */
public class Student
{
    private int studentID;
    
    public void study(int hours)
    {
        System.out.println("Normal student is studying for " 
                + hours 
                + " hours.");
    }
    
    @Override
    public String toString()
    {
        return "This is the student's information." ;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }
   
    public Student(int studentID)
    {
        this.studentID = studentID;
    }
    
    public Student()
    {
        
    }
}

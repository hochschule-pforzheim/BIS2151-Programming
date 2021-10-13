package foobar;

public class Student {

    private String name;
    private int matrNr;
    
    public Student() {}
    
    //This is a comment
    
    /*
        This 
        is
        a 
        comment
        over
        multiple
        lines
    */
    
    public Student(String newName, int newMatNr) {
        name = newName; 
        matrNr = newMatNr; 
    }
    
    public Student(String newName) {
        name = newName; 
    }
    
    /**
     * Confirms that the student has registered for the specified exam 
     * @param examName The exam the student registered for
     */
    public void registerForExam(String examName) {
        System.out.println("The student " + name + " has succesfully registered for the exam " + examName);
    }
        
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        //validate new name
        name = newName; 
    }

    /**
     * Gets the immatriculation number of the student
     * @return immatriculation number of the student
     */
    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }
}

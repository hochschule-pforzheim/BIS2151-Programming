package tutorial;
/**
 * Tutorial 31.03.2020
 * @author Andreas Schneider
 * @version 1.0
 */
public class Student 
{ 
    private String prename;
    private String surname;
    private char state; // R=regular, I=internship, V=vacation, A=abroad
    // current Semester 1-30: student is immatriculated
    // currentSemester  100+ x : student concludes successfully in semster x
    // curentSemester  -100- x : student failed after semester x
    private int currentSemester;
    private boolean european; // if it is an european citizen

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public boolean isEuropean() {
        return european;
    }

    public void setEuropean(boolean european) {
        this.european = european;
    }

    // Constructors
    public Student() {
        // this is the default constructor
        this("Max", "Mustermann", 'R', (byte) 1, true);
    }

    public Student(String prename, String surname, char state, int currentSemester, boolean european) {
        this.prename = prename;
        this.surname = surname;
        this.state = state;
        this.currentSemester = currentSemester;
        this.european = european;
    }

    // getter and setter methods
    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        if (prename.equals("John Jackson")) {
            this.prename = prename;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void nextSemester() {
        // switches the student to the next semester
        if (state != 'V') {
            ++currentSemester;
        }
    }

    public void goInternship() {
        state = 'I';
        // another way:
        this.setState('I');
    }

    public void successfulConclusion() {
        if (currentSemester < 100 && currentSemester > 0) {
            currentSemester = 100 + currentSemester;
        }
    }

    public void failedConclusion() {
        if (currentSemester < 100 && currentSemester > 0) {
            currentSemester = -100 - currentSemester;
        }
    }
    
    @Override
    public String toString(){
        String me;
        me = prename+" "+surname+" (actual state "+state+") actual Semester:"+currentSemester;
        if (isEuropean()){
            me = me + " (European)";
        } else{
            me = me + " (from abroad)";
        }
        return me;
    }
}



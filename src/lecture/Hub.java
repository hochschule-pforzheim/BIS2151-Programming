package lecture;

import building.Manager;

/**
 * The Hub class serves as the entry point for the program. It creates a Manager
 * object and invokes its run method to execute office-related operations. This
 * class facilitates the management of office-related activities. It uses
 * classes from the package "building".
 */
public class Hub
{

    /**
     * The main method, serving as the entry point of the program. It creates a
     * Manager object and invokes its run method.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Manager man = new Manager();
        man.run();
    }
}

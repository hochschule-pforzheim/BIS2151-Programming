package testat0;

/**
 * Lecture BIS2151
 * @author wernerburkard
 * @version 1.0
 */
public class BookManager
{

    final int MAXBOOKS = 20;  // Maximum of books we manage
    Book[] books = new Book[MAXBOOKS];

    public static void main(String[] args)
    {

        BookManager jonny = new BookManager();
        jonny.go();
    }

    public void go()
    {  
        // The Job of a book manager
        tutorial.Student s = new tutorial.Student();
        s.nextSemester();
        System.out.println("The student is");
        System.out.println(s);
        /*
        Scanner s = new Scanner(System.in); // for reading keyboard input
        int numberOfBooks = 0;
        int userInput = 0;
        char answer = ' ';

        do {   // start a loop with the job
            // present a menu to the user to select what to be done
            System.out.println("\nBook Management System V.1.0");
            System.out.println("1: Add Books");
            System.out.println("2: Show a Book");
            System.out.println("3: Update Books");
            System.out.println("4: Delete Books");
            System.out.println("5: Show ALL Books");
            System.out.println("0: EXIT");

            System.out.print("Your choice: ");
            userInput = s.nextInt();

            switch (userInput) {
                case 0:
                    System.exit(0);
                    break;
                case 1: // make a book
                    if (numberOfBooks == MAXBOOKS) {
                        System.out.println("Sorry: No more space in store left!");
                        break;
                    }
                    do {
                        System.out.println("Adding Books:");
                        Book aBook = new Book();
                        aBook.create(); // Fill in data to be a real book
                        books[numberOfBooks] = aBook; // Add it to the array
                        numberOfBooks++; // because we now have one book more
                        System.out.println("Another book to add? (Y/N)");
                        answer = s.next().toUpperCase().charAt(0);
                    } while (answer == 'Y');
                    break;
                case 2: // show a book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book in store!");
                        break;
                    }
                    System.out.println("\n\tEnter book index from 0 to " + (numberOfBooks - 1));
                    userInput = s.nextInt();
                    if ((userInput >= 0) && (userInput < numberOfBooks)) {
                        books[userInput].read();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 3:  // update book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book to update in store!");
                        break;
                    }
                    System.out.println("\n\tEnter book index from 0 to " + (numberOfBooks - 1));
                    userInput = s.nextInt();
                    if ((userInput >= 0) && (userInput < numberOfBooks)) {
                        books[userInput].update();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4: // delete a book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book to delete in store!");
                        break;
                    }
                    System.out.println("\n\tEnter book index from 0 to " + (numberOfBooks - 1));
                    userInput = s.nextInt();
                    if ((userInput >= 0) && (userInput < numberOfBooks)) {
                        books[userInput].delete();
                        for (int i = userInput; i < numberOfBooks; i++) {
                            books[i] = books[i + 1];
                        }
                    } else {
                        System.out.println("Invalid index");
                    }
                    numberOfBooks--;
                    break;
                case 5:
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No books in store!");
                        break;
                    }
                    System.out.println("List of books:");
                    for (int i = 0; i <= numberOfBooks; i++) {
                        books[i].read();
                    }
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        } while (true);  // do your job forever: infinite loop !!  
         */    }
}

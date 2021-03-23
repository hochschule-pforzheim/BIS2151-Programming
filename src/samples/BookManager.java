package samples;

import java.util.Scanner;

/**
 *
 * @author werner
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
    {  // The Job of a book manager
        Scanner s = new Scanner(System.in); // for reading keyboard input
        int numberOfBooks = 0;
        int userInput = 0;
        char answer = 0;

        do
        {   // start a loop with the job
            // present a menu to the user to select what to be done
            System.out.println("\nBook Management System V.1.0");
            System.out.println("1: Add Books");
            System.out.println("2: Show Books");
            System.out.println("3: Update Books");
            System.out.println("4: Delete Books");
            System.out.println("5: Show ALL Books");
            System.out.println("0: EXIT");

            System.out.print("Your choice: ");
            userInput = s.nextInt();

            switch (userInput)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if (numberOfBooks == MAXBOOKS)
                    {
                        System.out.println("Sorry: No more space in store left!");
                        break;
                    }
                    do
                    {
                        System.out.println("Adding Books:");
                        Book aBook = new Book();
                        aBook.create(); // Fill in data to be a real book
                        books[numberOfBooks] = aBook; // Add it to the array
                        numberOfBooks++; // because we now have one book more
                        System.out.println("Another book to add? (Y/N)");
                        answer = s.next().toUpperCase().charAt(0);
                    }
                    while (answer == 'Y');
                    break;
                case 2:
                    System.out.println("You entered 2");
                    break;
                case 3:
                    System.out.println("You entered 3");
                    break;
                case 4:
                    System.out.println("You entered 4");
                    break;
                case 5:
                    if (numberOfBooks == 0)
                    {
                        System.out.println("Sorry: No books in store!");
                        break;
                    }
                    System.out.println("List of books:");
                    for (int i = 0; i < numberOfBooks; i++)
                    {
                        books[i].read();
                    }
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        while (true);  // do your job forever: infinite loop !!  
    }

}

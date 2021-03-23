package samples;

import java.util.Scanner;

/**
 *
 * @author Prof. Werner Burkard
 */
public class Book
{

    private String isbn;
    private String bookName;
    private String author;

    // C  R  U  D 
    void create()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter book Name: ");
        bookName = s.nextLine();
        System.out.print("Enter book ISBN: ");
        isbn = s.nextLine();
        System.out.print("Enter book Author: ");
        author = s.nextLine();
    }

    void read()
    {
        System.out.print("Book " + isbn);
        System.out.print(": " + bookName);
        System.out.println("  (Author: " + author + ")");
    }

    void update()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Current Book Name is: " + bookName);
        System.out.print(" update Book Name to:");
        bookName = s.nextLine();
        System.out.println("Current Book ISBN is: " + isbn);
        System.out.print(" update Book ISBN to:");
        isbn = s.nextLine();
        System.out.println("Current Book Author is: " + author);
        System.out.print(" update Book Author to:");
        author = s.nextLine();
    }

    void delete()
    {
        bookName = null;
        isbn = null;
        author = null;
    }

}

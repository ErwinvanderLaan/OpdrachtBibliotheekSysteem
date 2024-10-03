package Main;

import System.Library;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    while (true) {

      // The choices for the user.
      System.out.println("""
          Choose one:
          1. add a book
          2. delete a book
          3. show a book
          4. show all persons
          5. borrow a book
          6. return a book
          7. show a list of all borrowed books
          8. show a list of all available books
          Or type 'q' to quit
          """);

      String choice = askForInput("Choose an option:");

      // A switch for each of the three choices.
      switch (choice) {
        case "1":
           library.addBook ();
           break;

        case "2":
          library.removeBook(1);
          break;

        case "3":
          library.showBook(1);
          break;

        case "4":
          library.showBooks();
          break;

        case "5":
          library.borrowBook(1);
          break;

        case "6":
          library.returnBook(1);
          break;

        case "7":
          library.showBorrowedBooks();
          break;

        case "8":
          library.showAvailableBooks();
          break;

        case "q":
          return;
      }


    }

  }

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }

}
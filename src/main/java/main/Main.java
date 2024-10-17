package main;

import library.Item;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

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
           item.addBook ();
           break;

        case "2":
          item.removeBook(1);
          break;

        case "3":
          item.showBook(1);
          break;

        case "4":
          item.showBooks();
          break;

        case "5":
          item.borrowBook(1);
          break;

        case "6":
          item.returnBook(1);
          break;

        case "7":
          item.showBorrowedBooks();
          break;

        case "8":
          item.showAvailableBooks();
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
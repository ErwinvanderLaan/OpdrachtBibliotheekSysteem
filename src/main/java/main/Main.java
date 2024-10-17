package main;

import Magazine.MagazineRepository;
import book.BookRepository;

import java.util.Scanner;


public class Main {

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }

  public static void main(String[] args) {
    BookRepository bookRepository = new BookRepository();
    MagazineRepository magazineRepository = new MagazineRepository();

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

      // A switch for each of the choices.
      switch (choice) {
        case "1":
          bookRepository.addBook ();
          break;

        case "2":
          bookRepository.removeBook(1);
          break;

        case "3":
          bookRepository.showBook(1);
          break;

        case "4":
          bookRepository.showBooks();
          break;

        case "5":
          bookRepository.borrowBook(1);
          break;

        case "6":
          bookRepository.returnBook(1);
          break;

        case "7":
          bookRepository.showBorrowedBooks();
          break;

        case "8":
          bookRepository.showAvailableBooks();
          break;

        case "q":
          return;
      }

    }

  }

}
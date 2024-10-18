package book;

import java.util.Scanner;

public class BookController {

  BookRepository bookRepository ;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public String showMenu() {
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
          BookRepository.addBook();
          break;

        case "2":
          BookRepository.removeBook(1);
          break;

        case "3":
          BookRepository.getBook(1);
          break;

        case "4":
          BookRepository.getAllBooks();
          break;

        case "5":
          BookRepository.borrowBook(1);
          break;

        case "6":
          BookRepository.returnBook(1);
          break;

        case "7":
          BookRepository.getBorrowedBooks();
          break;

        case "8":
          BookRepository.getAvailableBooks();
          break;

        case "q":
          return "";
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


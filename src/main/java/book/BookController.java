package book;

import static main.Main.askForInput;

/**
 * Goal of this class: Provides an options menu so the user can modify, and view, the book
 * repository It contains: 1. It has the 'showMenu' method, which prints the available methods to
 * the user. 2. It has a switch, to execute the chosen method.
 */
public class BookController {

  public static final String THE_ID_NUMBER = "Enter the ID number: \n";
  /**
   * Create a bookRepository.
   */
  BookRepository bookRepository;

  /**
   * BookRepository constructor.
   */
  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;

  }

  /**
   * Shows a menu by which a user can modify the repository.
   */
  public static void showMenu() {
    while (true) {

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

      String choice = askForInput("Choose an option:", "[1-8]|q");

      // A switch for each of the choices.
      switch (choice) {
        case "1":
          BookRepository.addBook();
          break;

        case "2":
          BookRepository.removeBook(
              Integer.parseInt(askForInput(THE_ID_NUMBER, "\\d+")));
          break;

        case "3":
          System.out.println(BookRepository.getBook(
              Integer.parseInt(askForInput(THE_ID_NUMBER, "\\d+"))));
          break;

        case "4":
          System.out.println(BookRepository.getAllBooks());
          break;

        case "5":
          BookRepository.borrowBook(
              Integer.parseInt(askForInput(THE_ID_NUMBER, "\\d+"))
          );
          break;

        case "6":
          BookRepository.returnBook(
              Integer.parseInt(askForInput(THE_ID_NUMBER, "\\d+"))
          );
          break;

        case "7":
          System.out.println(BookRepository.getBorrowedBooks());
          break;

        case "8":
          System.out.println(BookRepository.getAvailableBooks());
          break;

        case "q":
          return;

        default:
          System.out.println("Option not found.Please try again.");
      }
    }
  }
}








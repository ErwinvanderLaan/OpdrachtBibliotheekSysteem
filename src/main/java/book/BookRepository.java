package book;

import static main.Main.askForInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Goal of this class: This creates the book repository, which stores all added books. It contains:
 * 1. The repository class + constructor 2. All available methods to modify, and view, book objects
 * in the book repository 3. The 'borrowItem' method to set the 'borrowed status' of a specific book
 * to 'true.' 4. The 'returnItem' method to set the 'borrowed status' of a specific book to
 * 'false.'
 */
public class BookRepository {

  static ArrayList<Book> books = new ArrayList<>();

  /**
   * Add a book to books.
   */
  public static void addBook() {
    Book book = new Book(
        Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+")),
        askForInput("Enter the title of the book: \n", "[a-Z]"),
        askForInput("Enter the name of the author: \n", "[a-Z]"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n", "\\d+")),
        askForInput("Enter the ISBN: \n", "\\d+"),
        LocalDate.parse(askForInput("Enter the publication date \n", "\\d+"))
    );
    books.add(book);
  }

  /**
   * Remove a book from books.
   */
  public static void removeBook(long id) {
    books.removeIf(book -> book.getId() == id);
  }

  /**
   * Show a book from books.
   */
  public static List<Book> getBook(long id) {
    ArrayList<Book> book1 = new ArrayList<>();
    for (Book book : books) {
      if (book.getId() == id) {
        book1.add(book);
        break;
      }
    }
    return book1;
  }

  /**
   * Shows all books in books.
   */
  public static ArrayList<Book> getAllBooks() {
    return books;
  }

  /**
   * Shows all available books in books.
   */
  public static ArrayList<Book> getAvailableBooks() {
    ArrayList<Book> availableBooks = new ArrayList<>();
    for (Book book : books) {
      if (!book.hasBeenBorrowed()) {
        availableBooks.add(book);
      }
    }
    return availableBooks;
  }

  /**
   * Shows all borrowed books in books.
   */
  public static ArrayList<Book> getBorrowedBooks() {
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    for (Book book : books) {
      if (book.hasBeenBorrowed()) {
        borrowedBooks.add(book);
      }
    }
    return borrowedBooks;
  }

  /**
   * Set the borrowed status to true.
   */
  public static void borrowBook(long id) {
    for (Book book : books) {
      if (book.getId() == id) {
        book.borrowItem();
      }
    }
  }

  /**
   * Set the borrowed status to true.
   */
  public static void returnBook(long id) {
    for (Book book : books) {
      if (book.getId() == id) {
        book.returnItem();
      }
    }
  }
}







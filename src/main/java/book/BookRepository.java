// Goal of this class: This creates the book repository, which stores all added books.
// It contains:
// 1. The repository class + constructor
// 2. All available methods to modify, and view, book objects in the book repository
// 3. The 'borrowItem' method to set the 'borrowed status' of a specific book to 'true.'
// 4. The 'returnItem' method to set the 'borrowed status' of a specific book to 'false.'

package book;


import static main.Main.askForInput;
import java.time.LocalDate;
import java.util.ArrayList;


public class BookRepository {

  static ArrayList<Book> books;

// The methods

  // The constructor.
  public BookRepository(){
    books = new ArrayList<>();
  }

  // Add a book to 'books.'
  public static void addBook(){
    Book book = new Book (
        Integer.parseInt(askForInput("Enter the ID number: \n")),
        askForInput("Enter the title of the book: \n"),
        askForInput("Enter the name of the author: \n"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n")),
        askForInput("Enter the ISBN: \n"),
        LocalDate.parse (askForInput("Enter the publication date \n"))
    );
    books.add(book);
  }

  // Remove a book from 'books.'
  public static void removeBook(long id){
    books.removeIf(book -> book.getId() == id);
  }

  // Show a book from 'books.'
  public static ArrayList<Book>getBook(long id){
    ArrayList<Book> book1 = new ArrayList<>();
    for (Book book : books) {
      if (book.getId() == id)
          book1.add(book);
      break;
    }
    return book1;
  }

  // Shows all books in 'books.'
  public static ArrayList<Book> getAllBooks(){
    return books;
  }

  // Shows all available books in 'books.'
  public static ArrayList<Book> getAvailableBooks(){
    ArrayList<Book> availableBooks = new ArrayList<>();
    for (Book book : books) {
      if (!book.hasBeenBorrowed())
        availableBooks.add(book);
    }
    return availableBooks;
  }

  // Shows all borrowed books in 'books.'
  public static ArrayList <Book> getBorrowedBooks(){
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    for (Book book : books) {
      if (book.hasBeenBorrowed())
        borrowedBooks.add(book);
    }
    return borrowedBooks;
  }

  // Set the borrowed status to true
  public static void borrowBook(long id) {
    for(Book book : books)
      if (book.getId() == id)
        book.borrowItem();
  }

  // Set the borrowed status to true
  public static void returnBook(long id) {
    for (Book book : books)
      if (book.getId() == id)
        book.returnItem();
  }
}

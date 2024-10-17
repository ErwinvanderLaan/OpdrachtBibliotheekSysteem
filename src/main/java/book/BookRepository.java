package book;

import java.util.ArrayList;

import static main.Main.askForInput;

public class BookRepository {


  ArrayList<Book> books;

// The methods

  // The constructor.
  public BookRepository(){
    books = new ArrayList<>();
  }

  // Add a book to 'books.'
  public void addBook(){
    Book book = new Book (
        Integer.parseInt(askForInput("Enter the ID number: \n")),
        askForInput("Enter the title of the book: \n"),
        askForInput("Enter the name of the author: \n"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n")),
        askForInput("Enter the ISBN: \n")
    );
    books.add(book);
  }

  // Remove a book from 'books.'
  public void removeBook(long id){
    books.removeIf(book -> book.getId() == id);
  }

  public ArrayList<Book>getBook(long id){
    ArrayList<Book> book1 = new ArrayList<>();
    for (Book book : books) {
      if (book.getId() == id)
          book1.add(book);
      break;
    }
    return book1;
  }

  // Shows all books in 'books.'
  public ArrayList<Book> getAllBooks (){
    return new ArrayList<>(books);
  }

  // Shows all available books in 'books.'
  public ArrayList<Book> getAvailableBooks(){
    ArrayList<Book> availableBooks = new ArrayList<>();
    for (Book book : books) {
      if (!book.hasBeenBorrowed())
        availableBooks.add(book);
    }
    return availableBooks;
  }

  // Shows all borrowed books in 'books.'
  public ArrayList <Book> getBorrowedBooks(){
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    for (Book book : books) {
      if (book.hasBeenBorrowed())
        borrowedBooks.add(book);
    }
    return borrowedBooks;
  }

}

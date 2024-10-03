package System;

import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;


public class Library {

    ArrayList<Book> books;

// The methods

  // The constructor.
    public Library (){
      books = new ArrayList<>();
    }

  // Add a book
  public void addBook(){
      int a = Integer.parseInt(askForInput("Enter the ID number: \n"));
      String b = (askForInput("Enter the title of the book: \n"));
      String c = (askForInput("Enter the name of the author: \n"));
      int d = Integer.parseInt(askForInput("Enter the number of pages the book has: \n"));
      String e = (askForInput("Enter the ISBN: \n"));
      Book book = new Book (a, b, c, d, e);
      books.add(book);
  }

  // Remove a book
  public void removeBook(long id){
      for(Book book : books)
        if (book.getId() == id)
          books.remove(book);
      }

  // Show a book
  public String showBook(long id) {
    for(Book book : books)
      if (book.getId() == id)
       return book.getTitleWithAuthor();
    return "Id not found";
  }

  // Show titles and authors of all books
  public String showBooks() {
    for (Book book : books) {
      System.out.println(book.getTitleWithAuthor());
    }
    return "Id not found";
  }

  // Set the borrowed status to true
  public void borrowBook(long id) {
    for(Book book : books)
      if (book.getId() == id)
        book.borrowBook();
  }

  // Set the borrowed status to true
  public void returnBook(long id) {
    for (Book book : books)
      if (book.getId() == id)
        book.returnBook();
  }

  public String showBorrowedBooks(){
    for(Book book : books)
      if (book.hasBeenBorrowed() )
        System.out.println(book.getTitleWithAuthor());
    return "List of borrowed books is complete";
  }

  public String showAvailableBooks(){
    for(Book book : books)
      if (!book.hasBeenBorrowed() )
        System.out.println(book.getTitleWithAuthor());
    return "List of available books is complete";
  }
  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }

}




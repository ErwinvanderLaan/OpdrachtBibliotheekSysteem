// Goal of this class: A child class of 'Item'. It defines 'Book' objects.
// It contains:
// 1. The Book class + constructor + 'get-and-set methods' needed for other methods
// 2. The 'getOverview method' which displays the ISBN, Title and Author of a book.

package book;


import java.time.LocalDate;
import library.Item;


public class Book extends Item {

  private String author;
  private String isbn;


  // The methods:

  // The class constructor:
  public Book ( long id, String title, String author, int pages, String isbn, LocalDate publicationDate){
    super(id, title, pages, publicationDate);
    this.author = author;
    this.isbn = isbn;
  }
  public void getOverviewText(){
    System.out.println("Isbn: " + getIsbn() +
        " Title: " + getTitle() + " Author: " + getAuthor() );
  }
// Getters & Setters

  // Getters


  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;

  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // Setters
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
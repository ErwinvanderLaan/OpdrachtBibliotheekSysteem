package book;

import library.Item;

public class Book extends Item {

  private String isbn;


  // The methods:

  // The class constructor:
  public Book ( long id, String title, String author, int pages, String isbn){
  super(id, title, author, pages);
    this.isbn = isbn;
  }

  // Converts a class object to a String
  public String toString () {

    return this.id + " " + this.title + " " + this.author + " "
        + this.pages + " " + this.isbn;
  }

  // Getters & Setters
  public String getIsbn() {
    return isbn;

  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
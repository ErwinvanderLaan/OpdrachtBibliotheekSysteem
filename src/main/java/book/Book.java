package book;

class Book {

  private long id;
  private String title;
  private String author;
  private int pages;
  private String isbn;
  private boolean borrowed;

  // The methods:

  // The class constructor:
  public Book ( long id, String title, String author, int pages, String isbn){
    this.id = id;
    this.title = title;
    this.author = author;
    this.pages = pages;
    this.isbn = isbn;
  }

  // Converts a class object to a String
  public String toString () {
    return this.id + " " + this.title + " " + this.author + " " + this.pages + " " + this.isbn;
  }

  // Getters and setters:

  // Getters:
  public long getId(){
    return id;
  }

  public String getTitleWithAuthor(){
    return title + author;
  }

  public boolean hasBeenBorrowed(){
    return borrowed;
  }

  // Setters:
    public void borrowBook(){
    this.borrowed = true;
  }

    public void returnBook(){
    this.borrowed = false;
  }

}

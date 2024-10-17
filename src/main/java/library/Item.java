package library;

public class Item {

    protected long id;
    protected String title;
    protected String author;
    protected int pages;
    protected boolean borrowed = false;

  // The methods:

  // The class constructor:
  public Item ( long id, String title, String author, int pages){
    this.id = id;
    this.title = title;
    this.author = author;
    this.pages = pages;
  }


  // Returns whether 'borrowed' is ture or false
  public boolean hasBeenBorrowed(){
    return borrowed;
  }


  // Getters and setters:

  // Getters:
  public long getId(){
    return id;
  }

  public String getTitleWithAuthor(){
    return title + author;
  }

  // Setters:
  public void borrowBook(){
    this.borrowed = true;
  }

  public void returnBook(){
    this.borrowed = false;
  }


}

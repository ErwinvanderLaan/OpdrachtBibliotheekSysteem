package library;

import java.time.LocalDate;

abstract public class Item {

    private long id;
    private String title;
    private int pages;
    private boolean borrowed = false;
    private LocalDate publicationDate;

  // The methods:

  // The class constructor:
  public Item ( long id, String title, int pages, LocalDate publicationDate){
    this.id = id;
    this.title = title;
    this.pages = pages;
    this.publicationDate = publicationDate;
  }

  public abstract void getOverviewText();


  // Returns whether 'borrowed' is ture or false
  public boolean hasBeenBorrowed(){
    return borrowed;
  }


  // Getters and setters:

  // Getters:
  public long getId(){
    return id;
  }

  public String getTitle() {
    return title;
  }

  // Setters:
  public void borrowItem(){
    this.borrowed = true;
  }

  public void returnItem(){
    this.borrowed = false;
  }

}

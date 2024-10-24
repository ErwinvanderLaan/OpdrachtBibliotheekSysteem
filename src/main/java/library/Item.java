// Goal of this class: This is the parent class for all objects stored in the library.
// It contains:
// 1. The parent class + constructor + get & set methods needed for other methods
// 2. The abstract method 'getOverview' which gives a short overview of an item's properties.
// Which properties are shown varies per item, i.e. each item type overrides 'getOverview.'
// 3. Three methods by which the 'borrowed' status of an item can be viewed and modified to true / false.


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

  // Gives a short overview of an item's properties.
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

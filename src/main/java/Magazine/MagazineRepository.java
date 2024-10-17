package Magazine;


import static main.Main.askForInput;

import java.time.LocalDate;
import java.util.ArrayList;

public class MagazineRepository {

  ArrayList<Magazine> magazines;


// The methods

  // The constructor.
  public MagazineRepository() {
    magazines = new ArrayList<>();
  }

  // Add a book
  public void addMagazine(){
    Magazine magazine = new Magazine (
        Integer.parseInt(askForInput("Enter the ID number: \n")),
        askForInput("Enter the title of the book: \n"),
        askForInput("Enter the name of the author: \n"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n")),
        askForInput("Enter the ISSN: \n"),
        Integer.parseInt(askForInput("Enter the issue number: \n"))
        );
    magazines.add(magazine);
  }

  // Remove a book
  public void removeMagazine(long id){
    magazines.removeIf(magazine -> magazine.getId() == id);
  }
}

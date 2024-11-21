// Goal of this class: This creates the magazine repository, which stores all added magazines.
// It contains:
// 1. The repository class + constructor
// 2. All available methods to modify, and view, magazine objects in the magazine repository
// 3. The 'borrowItem' method to set the 'borrowed status' of a specific magazine to 'true.'
// 4. The 'returnItem' method to set the 'borrowed status' of a specific magazine to 'false.'

package magazine;

import static library.ItemRepository.items;
import static main.Main.askForInput;

import java.time.LocalDate;
import java.util.ArrayList;

public class MagazineRepository {
  static ArrayList<Magazine> magazines;

// The methods

  // The constructor.
  public MagazineRepository(){
    magazines = new ArrayList<>();
  }
  // Add a magazine to 'magazines.'
  public static void addMagazine(){
    Magazine magazine = new Magazine (
        Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+")),
        askForInput("Enter the title of the magazine: \n", "[a-Z]"),
        askForInput("Enter the name of the publisher: \n", "[a-Z]"),
        askForInput("Enter the name of the copy editor: \n", "[a-Z]"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n", "\\d+")),
        askForInput("Enter the ISSN: \n", "\\d+"),
        Integer.parseInt(askForInput("Enter the issue number: \n", "\\d+")),
        LocalDate.parse (askForInput("Enter the publication date \n", "\\d+"))
    );
    magazines.add(magazine);
    items.add(magazine);
  }

  // Remove a magazine from 'magazines.'
  public static void removeMagazine(long id){
    magazines.removeIf(magazine -> magazine.getId() == id);
  }

  // Show a magazine from 'magazines.'
  public static ArrayList<Magazine>getMagazine(long id){
    ArrayList<Magazine> magazine1 = new ArrayList<>();
    for (Magazine magazine : magazines) {
        if (magazine.getId() == id)
          magazine1.add(magazine);
      break;
    }
    return magazine1;
  }

  // Shows all magazines in 'magazines.'
  public static ArrayList<Magazine> getAllMagazines(){
    return magazines;
  }

  // Shows all available magazines in 'magazines.'
  public static ArrayList<Magazine> getAvailableMagazines(){
    ArrayList<Magazine> availableMagazines = new ArrayList<>();
    for (Magazine magazine : magazines) {
      if (!magazine.hasBeenBorrowed())
        availableMagazines.add(magazine);
    }
    return availableMagazines;
  }

  // Shows all borrowed magazines in 'magazines.'
  public static ArrayList <Magazine> getBorrowedMagazines(){
    ArrayList<Magazine> borrowedMagazines = new ArrayList<>();
    for (Magazine magazine : magazines) {
      if (magazine.hasBeenBorrowed())
        borrowedMagazines.add(magazine);
    }
    return borrowedMagazines;
  }

  // Set the borrowed status to true
  public static void borrowMagazine(long id) {
    for(Magazine magazine : magazines)
      if (magazine.getId() == id)
        magazine.borrowItem();
  }

  // Set the borrowed status to true
  public static void returnMagazine(long id) {
    for (Magazine magazine : magazines)
      if (magazine.getId() == id)
        magazine.returnItem();
  }

}


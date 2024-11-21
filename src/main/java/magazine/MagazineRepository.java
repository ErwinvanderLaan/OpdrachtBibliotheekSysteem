package magazine;

import static main.Main.askForInput;
import java.util.ArrayList;

public class MagazineRepository {

  static ArrayList<Magazine> magazines;


// The methods

  // The constructor.
  public MagazineRepository() {
    magazines = new ArrayList<>();
  }

  // Add a book
  public static void addMagazine(){
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
  public static void removeMagazine(long id){
    magazines.removeIf(magazine -> magazine.getId() == id);
  }

  // Show a book from 'magazines.'
  public static ArrayList<Magazine>getMagazine(long id){
    ArrayList<Magazine> magazine1 = new ArrayList<>();
    for(Magazine magazine: magazines) {
      if(magazine.getId() == id)
        magazine1.add(magazine);
      break;
    }
    return magazine1;
}

// Shows all magazines in 'magazine.'
  public static ArrayList<Magazine> getAllMagazines() {
    return magazines;
  }

  // Shows all available magazines in 'magazine.'
  public static ArrayList<Magazine> getAvailableMagazines(){
    ArrayList<Magazine> availableMagazines = new ArrayList<>();
    for (Magazine magazine: magazines) {
      if (!magazine.hasBeenBorrowed())
        availableMagazines.add(magazine);
    }
    return availableMagazines;
  }

  // Shows all available magazines in 'magazine.'
  public static ArrayList <Magazine> getBorrowedMagazines(){
    ArrayList<Magazine> borrowedMagazines = new ArrayList<>();
    for (Magazine magazine: magazines) {
      if(magazine.hasBeenBorrowed())
        borrowedMagazines.add(magazine);
    }
    return borrowedMagazines;
  }

  // Set the borrowed status to 'true'
  public static void borrowMagazine(long id) {
    for (Magazine magazine : magazines)
      if(magazine.getId() == id)
        magazine.borrowItem();
  }

  // Set the borrowed status to 'true'
  public static void returnMagazine(long id) {
    for (Magazine magazine : magazines)
      if(magazine.getId() == id)
        magazine.returnItem();
  }
}


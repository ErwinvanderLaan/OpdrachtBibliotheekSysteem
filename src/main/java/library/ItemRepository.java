package library;


import java.util.ArrayList;

public class ItemRepository {

  public static ArrayList<Item> items;

  // The constructor.
  public ItemRepository () {
    items = new ArrayList<>();
  }


  // Set the borrowed status to true
  public static void borrowItem(long id) {
    for(Item item : items)
      if (item.getId() == id)
        item.borrowItem();
  }

  // Shows all borrowed books in 'books.'
  public static ArrayList<Item> getBorrowedItems(){
    ArrayList<Item> borrowedItems = new ArrayList<>();
    for (Item item : items) {
      if (item.hasBeenBorrowed())
        borrowedItems.add(item);
    }
    return borrowedItems;
  }

  // Shows all available books in 'books.'
  public static ArrayList<Item> getAvailableItems(){
    ArrayList<Item> availableItems = new ArrayList<>();
    for (Item item: items) {
      if (!item.hasBeenBorrowed())
        availableItems.add(item);
    }
    return availableItems;
  }

  // Set the borrowed status to false
  public static void returnItem(long id) {
    for (Item item : items)
      if (item.getId() == id)
        item.returnItem();
  }
}


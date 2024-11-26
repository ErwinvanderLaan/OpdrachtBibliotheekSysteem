package library;

import static main.Main.askForInput;

/**
 * The BorrowService class deals with the borrowing of items.
 */
public class BorrowService {

  /**
   * This makes an item repository.
   */
  ItemRepository itemRepository;

  /**
   * The constructor.
   */
  public BorrowService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  /**
   * Displays a menu from which a user can borrow or return items.
   */
  public static void showMenu() {
    while (true) {

      // The choices for the user.
      System.out.println("""
          Choose one:
          1. borrow an item
          2. return an item
          3. show a list of all borrowed items
          4. show a list of all available items
          Or type 'q' to quit
          """);

      String choice = askForInput("Choose an option:", "[1-4]|q");

      // A switch for each of the choices.
      switch (choice) {
        case "1":
          ItemRepository.borrowItem(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+"))
          );
          break;

        case "2":
          ItemRepository.returnItem(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+"))
          );
          break;

        case "3":
          System.out.println(ItemRepository.getBorrowedItems());
          break;

        case "4":
          System.out.println(ItemRepository.getAvailableItems());
          break;

        case "q":
          return;
        default:
          System.out.println("Option not found. Please try again.");
      }


    }
  }
}









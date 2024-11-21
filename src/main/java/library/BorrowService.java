package library;

import static main.Main.askForInput;


public class BorrowService {


  ItemRepository itemRepository;

  public BorrowService (ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

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

      String choice = askForInput("Choose an option:", "[1-4] | q");

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
      }


    }
  }
}









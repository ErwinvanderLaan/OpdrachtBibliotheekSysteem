// Goal of this class: Provides an options menu so the user can modify, and view, the magazine repository
// It contains:
// 1. It has the 'showMenu' method, which prints the available methods to the user.
// 2. It has a switch, to execute the chosen method.

package magazine;


import static main.Main.askForInput;


public class MagazineController {

  public static void showMenu() {
    while (true) {

      // The choices for the user.
      System.out.println("""
              Choose one:
              1. add a magazine to the library.
              2. remove a magazine from the library.
              3. show a magazine from the library.
              4. show all magazines from the library.
              5. borrow a magazine from the library.
              6. return a magazine to the library.
              7. show a list of all borrowed magazines.
              8. show a list of all available magazines.
              Or type 'q' to quit.
              """);

      String choice = askForInput("Choose an option:", "[1-8]|q");

      // A switch for each of the choices.
      switch (choice) {
        case "1":
          MagazineRepository.addMagazine();
          break;

        case "2":
          MagazineRepository.removeMagazine(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+")));
          break;

        case "3":
          System.out.println(MagazineRepository.getMagazine(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+"))));
          break;

        case "4":
          System.out.println(MagazineRepository.getAllMagazines());
          break;

        case "5":
          MagazineRepository.borrowMagazine(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+")));
          break;

        case "6":
          MagazineRepository.returnMagazine(
              Integer.parseInt(askForInput("Enter the ID number: \n", "\\d+")));
          break;

        case "7":
          System.out.println(MagazineRepository.getBorrowedMagazines());
          break;

        case "8":
          System.out.println(MagazineRepository.getAvailableMagazines());
          break;

        case "q":
          return;
      }
    }
  }
}





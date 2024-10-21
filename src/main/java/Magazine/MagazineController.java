package magazine;

import java.util.Scanner;

public class MagazineController {

  MagazineRepository magazineRepository;

  public MagazineController(MagazineRepository magazineRepository){
    this.magazineRepository = magazineRepository;
  }

  public String showMenu() {
    while (true) {

      // The choices for the user.
      System.out.println("""
              Choose one:
              1. add a book
              2. delete a book
              3. show a book
              4. show all persons
              5. borrow a book
              6. return a book
              7. show a list of all borrowed books
              8. show a list of all available books
              Or type 'q' to quit
              """);

      String choice = askForInput("Choose an option:");

      // A switch for each of the three choices.
      switch (choice) {
        case "1":
          MagazineRepository.addMagazine();
          break;

        case "2":
          MagazineRepository.removeMagazine(1);
          break;

        case "3":
          MagazineRepository.getMagazine(1);
          break;

        case "4":
          MagazineRepository.getAllMagazines();
          break;

        case "5":
          MagazineRepository.borrowMagazine(1);
          break;

        case "6":
          MagazineRepository.returnMagazine(1);
          break;

        case "7":
          MagazineRepository.getBorrowedMagazines();
          break;

        case "8":
          MagazineRepository.getAvailableMagazines();
          break;

        case "q":
          return "";
      }
    }
  }

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }
}

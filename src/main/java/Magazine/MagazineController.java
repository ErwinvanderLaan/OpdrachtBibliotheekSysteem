package magazine;

import java.util.Scanner;

public class MagazineController {

  MagazineRepository magazineRepository;

  public MagazineController(MagazineRepository magazineRepository){
    this.magazineRepository = magazineRepository;
  }

  public static void showMenu() {
    while (true) {

      // The choices for the user.
      System.out.println("""
              Choose one:
              1. add a magazine
              2. delete a magazine
              3. show a magazine
              4. show all magazines
              5. borrow a magazine
              6. return a magazine
              7. show a list of all borrowed magazines
              8. show a list of all available magazines
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
          System.out.println(MagazineRepository.getMagazine(1));
          break;

        case "4":
          System.out.println(MagazineRepository.getAllMagazines());
          break;

        case "5":
          MagazineRepository.borrowMagazine(1);
          break;

        case "6":
          MagazineRepository.returnMagazine(1);
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

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }
}

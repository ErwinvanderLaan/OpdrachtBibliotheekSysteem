package main;

import book.BookController;
import book.BookRepository;
import magazine.MagazineController;
import magazine.MagazineRepository;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    BookRepository bookRepository = new BookRepository();

    MagazineRepository magazineRepository = new MagazineRepository();


//Shows a menu where the user can choose between working with books or magazines
    System.out.println("""
        Choose an option:
        1. Work with books
        2. Work with magazines
        3. Type 'q' to quit.
        """);

    String choice = askForInput("Choose an option:");

    // A switch for each of the three choices.
    switch (choice) {
      case "1":
        BookController.showMenu();
        break;

      case "2":
        MagazineController.showMenu();
        break;

      case "q":
        break;
    }

  }

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }

}
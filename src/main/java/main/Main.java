// Goal of this class: The main class starts the application. Specifically:
// 1. It creates a book- and a magazine repository, so created objects can be stored in these.
// 2. It has a scanner method, so user input can be processed.
// 3. It has a switch, to allow a user to work with either books or magazines.

package main;


import book.BookController;
import book.BookRepository;
import java.util.regex.Pattern;
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

    String choice = askForInput("Choose an option:", "[1-3] | q");

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
  public static String askForInput (String question, String pattern){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    if (pattern != null){
      while (!scanner.hasNext(Pattern.compile(pattern))){
        System.out.println("Validation message");
        scanner.next();
      }
    }
    return scanner.next();
  }

}
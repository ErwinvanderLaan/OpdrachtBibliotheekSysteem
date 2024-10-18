package main;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    }

  // Scanner method to ask for user input.
  public static String askForInput (String question){
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.next();
  }

}
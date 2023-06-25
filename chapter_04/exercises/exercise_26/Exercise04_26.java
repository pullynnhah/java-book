package chapter_04.exercises.exercise_26;

import java.util.Scanner;

public class Exercise04_26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example, 11.56: ");
    String amountString = scanner.nextLine();

    int dotIndex = amountString.indexOf('.');

    int remainingAmount = Integer.parseInt(amountString.substring(dotIndex + 1));

    int numberOfOneDollars = Integer.parseInt(amountString.substring(0, dotIndex));
    remainingAmount = remainingAmount % 100;

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    System.out.println("Your amount " + amountString + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }
}

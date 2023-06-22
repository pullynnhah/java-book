package chapter_02.exercises.exercise_22;

import java.util.Scanner;

public class Exercise02_22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an amount in integer, for example 1156");
    System.out.print("for 11 dollars and 56 cents: ");
    int amount = scanner.nextInt();
    int remainingAmount = amount;

    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount %= 100;

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount %= 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount %= 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount %= 5;

    int numberOfPennies = remainingAmount;

    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }
}

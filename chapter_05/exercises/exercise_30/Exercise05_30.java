package chapter_05.exercises.exercise_30;

import java.util.Scanner;

public class Exercise05_30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount to be saved for each month: ");
    double monthlyAmount = scanner.nextDouble();

    System.out.print("Enter the annual interest rate: ");
    double interest = scanner.nextDouble() / 1200;

    System.out.print("Enter the number of months: ");
    int months = scanner.nextInt();

    double factor = 1 + interest;
    double amount = 0;
    for (int i = 0; i < months; i++) {
      amount = (amount + monthlyAmount) * factor;
    }

    System.out.printf("After the %dth month, the account value is %.2f\n", months, amount);
  }
}

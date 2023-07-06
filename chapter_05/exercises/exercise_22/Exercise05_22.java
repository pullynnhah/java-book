package chapter_05.exercises.exercise_22;

import java.util.Scanner;

public class Exercise05_22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter loan amount, for example 120000.95: ");
    double loanAmount = scanner.nextDouble();

    System.out.print("Enter number of years as an integer, for example 5: ");
    int months = scanner.nextInt() * 12;

    System.out.print("Enter yearly interest rate, for example 8.25: ");
    double interestRate = scanner.nextDouble() / 1200;

    double monthlyPayment = loanAmount * interestRate
      / (1 - Math.pow(1 / (1 + interestRate), months));
    double totalPayment = monthlyPayment * months;

    System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
    System.out.printf("Total Payment: %.2f\n\n", totalPayment);


    System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#", "Interest", "Principal", "Balance");
    for (int i = 1; i <= months; i++) {
      double interest = loanAmount * interestRate;
      double payment;
      if (i == months) {
        payment = loanAmount;
        loanAmount = 0;
      } else {
        payment = monthlyPayment - interest;
        loanAmount -= payment;
      }

      System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n",
        i, interest, payment, loanAmount);
    }
  }
}

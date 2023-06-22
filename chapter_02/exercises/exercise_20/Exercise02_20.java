package chapter_02.exercises.exercise_20;

import java.util.Scanner;

public class Exercise02_20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter balance and annual interest rate: ");
    double balance = scanner.nextDouble();
    double annualInterestRate = scanner.nextDouble();

    double interest = balance * (annualInterestRate / 1200);
    System.out.println("The interest is " + ((int) (interest * 100) / 100.0));
  }
}

package chapter_03.exercises.exercise_12;

import java.util.Scanner;

public class Exercise03_12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a three-digit integer: ");
    int number = scanner.nextInt();

    int lastDigit = Math.abs(number) % 10;
    int firstDigit = Math.abs(number) / 100;

    if (lastDigit == firstDigit)
      System.out.println(number + " is a palindrome");
    else
      System.out.println(number + " is not a palindrome");
  }
}

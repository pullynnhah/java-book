package chapter_02.exercises.exercise_06;

import java.util.Scanner;

public class Exercise02_06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer between 0 and 1000: ");
    int number = scanner.nextInt();

    int firstDigit = number % 10;
    int secondDigit = number / 10 % 10;
    int thirdDigit = number / 100 % 10;
    int fourthDigit = number / 1000;

    int sumDigits = firstDigit + secondDigit + thirdDigit + fourthDigit;
    System.out.print("The sum of all digits in " + number + " is " + sumDigits);
  }
}

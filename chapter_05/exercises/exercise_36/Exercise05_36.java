package chapter_05.exercises.exercise_36;

import java.util.Scanner;

public class Exercise05_36 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int isbn = scanner.nextInt();

    int sum = 0;
    int partialIsbn = isbn;
    for (int i = 9; i >= 1; i--) {
      int digit = partialIsbn % 10;
      partialIsbn /= 10;
      sum += digit * i;
    }

    int lastDigit = sum % 11;
    System.out.printf("The ISBN-10 number is %09d", isbn);
    System.out.println(lastDigit == 10 ? "X" : lastDigit);
  }
}

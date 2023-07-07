package chapter_06.exercises.exercise_02;

import java.util.Scanner;

public class Exercise06_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    long number = scanner.nextLong();

    System.out.println("The sum of digits for " +
      number + " is " + sumDigits(number));
  }

  public static int sumDigits(long n) {
    long absN = Math.abs(n);

    int sum = 0;
    do {
      sum += absN % 10;
      absN /= 10;
    } while (absN != 0);

    return sum;
  }
}

package chapter_06.exercises.exercise_04;

import java.util.Scanner;

public class Exercise06_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a integer: ");
    int number = scanner.nextInt();

    reverse(number);
  }

  public static void reverse(int number) {
    do {
      System.out.print(number % 10);
      number /= 10;
    } while (number != 0);
    System.out.println();
  }
}

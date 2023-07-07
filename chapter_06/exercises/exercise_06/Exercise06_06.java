package chapter_06.exercises.exercise_06;

import java.util.Scanner;

public class Exercise06_06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a integer: ");
    int number = scanner.nextInt();
    displayPattern(number);
  }

  public static void displayPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > 0; j--) {
        if (j > i) System.out.print("  ");
        else System.out.print(" " + j);
      }
      System.out.println();
    }
  }
}

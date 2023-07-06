package chapter_05.exercises.exercise_16;

import java.util.Scanner;

public class Exercise05_16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    int div = 2;
    System.out.print("Factors(" + number + ") =");
    while (number > 1) {
      while (number % div == 0) {
        number /= div;
        System.out.print(" " + div);
      }
      div++;
    }
  }
}

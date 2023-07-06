package chapter_05.exercises.exercise_38;

import java.util.Scanner;

public class Exercise05_38 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int decimal = scanner.nextInt();

    int aux = decimal;
    String octal = "";
    do {
      octal = aux % 8 + octal;
      aux /= 8;
    } while (aux != 0);

    System.out.printf("%d's octal representation is %s\n", decimal, octal);
  }
}

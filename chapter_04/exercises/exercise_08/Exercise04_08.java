package chapter_04.exercises.exercise_08;

import java.util.Scanner;

public class Exercise04_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an ASCII code: ");
    int asciiCode = scanner.nextInt();

    char asciiChar = (char) asciiCode;
    System.out.printf("The character for ASCII code %d is %c\n", asciiCode, asciiChar);
  }
}

package chapter_06.exercises.exercise_22;

import java.util.Scanner;

public class Exercise06_22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a positive number: ");
    long number = scanner.nextLong();

    System.out.println("The square root for" + number + " is " + sqrt(number));
  }

  public static double sqrt(long n) {
    final double EPSILON = 0.0001;
    double lastGuess;
    double nextGuess = 1;

    do {
      lastGuess = nextGuess;
      nextGuess = (lastGuess + n / lastGuess) / 2;
    } while (Math.abs(nextGuess - lastGuess) >= EPSILON);

    return nextGuess;
  }
}

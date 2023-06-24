package chapter_03.exercises.exercise_22;

import java.util.Scanner;

public class Exercise03_22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a point with two coordinates: ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    if (distance <= 10)
      System.out.println("Point (" + x + ", " + y + ") is in the circle");
    else
      System.out.println("Point (" + x + ", " + y + ") is not in the circle");
  }
}

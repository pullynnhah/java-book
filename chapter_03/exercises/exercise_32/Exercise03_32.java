package chapter_03.exercises.exercise_32;

import java.util.Scanner;

public class Exercise03_32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three points for p0, p1, and p2: ");
    double x0 = scanner.nextDouble();
    double y0 = scanner.nextDouble();
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double difference = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    System.out.print("(" + x2 + ", " + y2 + ") ");
    if (difference > 0)
      System.out.print("is on the left side of the line from ");
    else if (difference < 0)
      System.out.print("is on the right side of the line from ");
    else
      System.out.print("is on the same line from ");

    System.out.print("(" + x0 + ", " + y0 + ") to ("
      + x1 + ", " + y1 + ")");
  }
}

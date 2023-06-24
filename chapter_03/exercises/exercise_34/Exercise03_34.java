package chapter_03.exercises.exercise_34;

import java.util.Scanner;

public class Exercise03_34 {
  public static void main(String[] args) {
    final double EPSILON = 1e-14;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three points for p0, p1, and p2: ");
    double x0 = scanner.nextDouble();
    double y0 = scanner.nextDouble();
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double difference = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    boolean isOnLine = Math.abs(difference) < EPSILON;
    boolean xOnLine = x0 <= x2 && x2 <= x1 || x1 <= x2 && x2 <= x0;
    boolean yOnLine = y0 <= y2 && y2 <= y1 || y1 <= y2 && y2 <= y0;

    System.out.print("(" + x2 + ", " + y2 + ") ");

    if (isOnLine && xOnLine && yOnLine)
      System.out.print("is on the line segment from ");
    else
      System.out.print("is not on the line segment from ");

    System.out.print("(" + x0 + ", " + y0 + ") to ("
      + x1 + ", " + y1 + ")");
  }
}

package chapter_03.exercises.exercise_28;

import java.util.Scanner;

public class Exercise03_28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
      "Enter r1's center x-, y-coordinates, width, and height: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double width1 = scanner.nextDouble();
    double height1 = scanner.nextDouble();

    System.out.print(
      "Enter r2's center x-, y-coordinates, width, and height: ");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    double width2 = scanner.nextDouble();
    double height2 = scanner.nextDouble();

    double xDistance = Math.abs(x1 - x2);
    double yDistance = Math.abs(y1 - y2);

    if (xDistance <= (width1 - width2) / 2 && yDistance <= (height1 - height2) / 2)
      System.out.println("r2 is inside r1");
    else if (xDistance <= (width1 + width2) / 2 && yDistance <= (height1 + height2) / 2)
      System.out.println("r2 overlaps r1");
    else
      System.out.println("r2 does not overlap r1");
  }
}

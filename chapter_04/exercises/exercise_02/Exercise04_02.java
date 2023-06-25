package chapter_04.exercises.exercise_02;

import java.util.Scanner;

public class Exercise04_02 {
  public static void main(String[] args) {
    final double EARTH_RADIUS = 6371.01;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
    double x1 = Math.toRadians(scanner.nextDouble());
    double y1 = Math.toRadians(scanner.nextDouble());

    System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
    double x2 = Math.toRadians(scanner.nextDouble());
    double y2 = Math.toRadians(scanner.nextDouble());

    double distance = EARTH_RADIUS
      * Math.acos(Math.sin(x1) * Math.sin(x2)
      + Math.cos(x1) * Math.cos(x2)
      * Math.cos(y2 - y1));

    System.out.println("The distance between the two points is " + distance + " km");
  }
}

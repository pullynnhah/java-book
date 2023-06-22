package chapter_02.exercises.exercise_12;

import java.util.Scanner;

public class Exercise02_12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter speed v: ");
    double speed = scanner.nextDouble();

    System.out.print("Enter acceleration a: ");
    double acceleration = scanner.nextDouble();

    double minimumRunwayLength = Math.pow(speed, 2) / (2 * acceleration);
    System.out.println("The minimum runway length for this airplane is "
      + minimumRunwayLength + " meters");
  }
}

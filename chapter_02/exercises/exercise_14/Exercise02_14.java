package chapter_02.exercises.exercise_14;

import java.util.Scanner;

public class Exercise02_14 {
  public static void main(String[] args) {
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    final double weight = scanner.nextDouble() * KILOGRAMS_PER_POUND;

    System.out.print("Enter height in inches: ");
    final double height = scanner.nextDouble() * METERS_PER_INCH;

    double bmi = weight / Math.pow(height, 2);
    System.out.println("BMI is " + bmi);
  }
}

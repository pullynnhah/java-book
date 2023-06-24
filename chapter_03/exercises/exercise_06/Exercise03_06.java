package chapter_03.exercises.exercise_06;

import java.util.Scanner;

public class Exercise03_06 {
  public static void main(String[] args) {
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final int INCHES_PER_FOOT = 12;
    final double METERS_PER_INCH = 0.0254;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    final double weight = scanner.nextDouble() * KILOGRAMS_PER_POUND;

    System.out.print("Enter feet: ");
    double height = scanner.nextDouble()
      * INCHES_PER_FOOT * METERS_PER_INCH;

    System.out.print("Enter inches: ");
    height += scanner.nextDouble() * METERS_PER_INCH;

    double bmi = weight / Math.pow(height, 2);

    System.out.println("BMI is " + bmi);

    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
  }
}

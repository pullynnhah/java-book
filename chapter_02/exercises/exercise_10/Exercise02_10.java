package chapter_02.exercises.exercise_10;

import java.util.Scanner;

public class Exercise02_10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double mass = scanner.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double initialTemperature = scanner.nextDouble();

    System.out.print("Enter the final temperature: ");
    double finalTemperature = scanner.nextDouble();

    double energy = mass * (finalTemperature - initialTemperature) * 4184;
    System.out.println("The energy needed is " + energy);
  }
}

package chapter_03.exercises.exercise_20;

import java.util.Scanner;

public class Exercise03_20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature in Fahrenheit: ");
    double temperature = scanner.nextDouble();
    if (temperature < -58 || temperature > 41) {
      System.out.println("Temperature must be between -58°C and 41°F");
      return;
    }

    System.out.print("Enter the wind speed miles per hour: ");
    double windSpeed = scanner.nextDouble();
    if (windSpeed < 2) {
      System.out.println("Speed must be greater than or equal to 2");
      return;
    }

    double windChillIndex = 35.74 + 0.6215 * temperature
      - 35.75 * Math.pow(windSpeed, 0.16)
      + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

    System.out.println("The wind chill index is " + windChillIndex);
  }
}

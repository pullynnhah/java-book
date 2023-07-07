package chapter_06.exercises.exercise_08;

public class Exercise06_08 {
  public static void main(String[] args) {
    System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
    System.out.println("-".repeat(58));
    for (int i = 0; i < 10; i++) {
      double celsius = 40 - i;
      double fahrenheit = 120 - 10 * i;
      System.out.printf("%-15.1f%-15.1f%-5s%-15.1f%-15.1f\n",
        celsius, celsiusToFahrenheit(celsius), "|",
        fahrenheit, fahrenheitToCelsius(fahrenheit));
    }
  }

  public static double celsiusToFahrenheit(double celsius) {
    return 9.0 / 5 * celsius + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return 5.0 / 9 * (fahrenheit - 32);
  }
}

package chapter_03.exercises.exercise_08;

import java.util.Scanner;

public class Exercise03_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three integers: ");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int number3 = scanner.nextInt();

    if (number3 < number2) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }

    if (number3 < number1) {
      int temp = number1;
      number1 = number3;
      number3 = temp;
    }

    if (number2 < number1) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.println("The sorted numbers are " +
      number1 + " " + number2 + " " + number3);
  }
}

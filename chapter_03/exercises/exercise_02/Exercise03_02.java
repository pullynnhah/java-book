package chapter_03.exercises.exercise_02;

import java.util.Scanner;

public class Exercise03_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 10 % 10);
    int number3 = (int) (System.currentTimeMillis() / 100 % 10);

    System.out.print(
      "What is " + number1 + " + " + number2 + " + " + number3  + "? ");
    int answer = scanner.nextInt();

    System.out.println(
      number1 + " + " + number2 + " + " + number3 + " = " +
        answer + " is " + (number1 + number2 + number3 == answer));
  }
}

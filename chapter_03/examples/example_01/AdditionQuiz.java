package chapter_03.examples.example_01;

import java.util.Scanner;

public class AdditionQuiz {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 10 % 10);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();

    System.out.println(
      number1 + " + " + number2 + " = " + answer + " is " +
        (number1 + number2 == answer));
  }
}

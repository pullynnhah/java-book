package chapter_02.exercises.exercise_04;

import java.util.Scanner;

public class Exercise02_04 {
  public static void main(String[] args) {
    final double KILOGRAMS_PER_POUND = 0.454;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number in pounds: ");
    double pounds = scanner.nextDouble();

    double kilograms = pounds * KILOGRAMS_PER_POUND;
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}

package chapter_02.exercises.exercise_16;

import java.util.Scanner;

public class Exercise02_16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the side: ");
    double side = scanner.nextDouble();

    double area = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
    System.out.println("The area of the hexagon is " + area);
  }
}

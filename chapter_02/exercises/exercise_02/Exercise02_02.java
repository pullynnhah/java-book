package chapter_02.exercises.exercise_02;

import java.util.Scanner;

public class Exercise02_02 {
  public static void main(String[] args) {
    final double PI = 3.14159;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = scanner.nextDouble();
    double length = scanner.nextDouble();

    double area = radius * radius * PI;
    double volume = area * length;

    System.out.println("The area is " + area);
    System.out.println("The volume of the cylinder is " + volume);
  }
}

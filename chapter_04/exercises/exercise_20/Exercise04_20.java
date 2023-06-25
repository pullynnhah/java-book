package chapter_04.exercises.exercise_20;

import java.util.Scanner;

public class Exercise04_20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    System.out.println("The length of the string is " + str.length());
    System.out.println("The first character in the string is " + str.charAt(0));
  }
}

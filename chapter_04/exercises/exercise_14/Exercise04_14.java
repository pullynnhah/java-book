package chapter_04.exercises.exercise_14;

import java.util.Scanner;

public class Exercise04_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a letter grade: ");
    char letterGrade = scanner.nextLine().charAt(0);

    String result = "The numeric value for grade " + letterGrade + " is ";
    switch (Character.toLowerCase(letterGrade)) {
      case 'a' -> result += 4;
      case 'b' -> result += 3;
      case 'c' -> result += 2;
      case 'd' -> result += 1;
      case 'f' -> result += 0;
      default -> result = letterGrade + " is an invalid grade";
    }

    System.out.println(result);
  }
}

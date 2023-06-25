package chapter_04.exercises.exercise_18;

import java.util.Scanner;

public class Exercise04_18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two characters: ");
    String majorStatus = scanner.nextLine();

    char major = majorStatus.charAt(0);
    char status = majorStatus.charAt(1);

    String result;
    switch (major) {
      case 'M' -> result = "Mathematics ";
      case 'C' -> result = "Computer Science ";
      case 'I' -> result = "Information Technology ";
      default -> result = "Invalid input: Wrong major code";
    }

    if (result.contains("Wrong")) {
      System.out.println(result);
      return;
    }

    switch (status) {
      case '1' -> result += "Freshman";
      case '2' -> result += "Sophomore";
      case '3' -> result += "Junior";
      case '4' -> result += "Senior";
      default -> result = "Invalid input: Wrong status code";
    }

    System.out.println(result);
  }
}

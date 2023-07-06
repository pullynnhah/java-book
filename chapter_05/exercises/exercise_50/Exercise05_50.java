package chapter_05.exercises.exercise_50;

import java.util.Scanner;

public class Exercise05_50 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String text = scanner.nextLine();

    int upperCount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isUpperCase(text.charAt(i))) upperCount++;
    }

    System.out.println("The number of uppercase letters is " + upperCount);
  }
}

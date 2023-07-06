package chapter_05.exercises.exercise_46;

import java.util.Scanner;

public class Exercise05_46 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String text = scanner.nextLine();

    String reverse_text = "";
    for (int i = 0; i < text.length(); i++) {
      reverse_text = text.charAt(i) + reverse_text;
    }

    System.out.println("The reversed string is " + reverse_text);
  }
}

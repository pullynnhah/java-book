package chapter_05.exercises.exercise_48;

import java.util.Scanner;

public class Exercise05_48 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String text = scanner.nextLine();

    String odd_text = "";
    for (int i = 1; i < text.length(); i += 2) {
      odd_text += text.charAt(i);
    }

    System.out.println(odd_text);
  }
}

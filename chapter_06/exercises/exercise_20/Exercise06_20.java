package chapter_06.exercises.exercise_20;

import java.util.Scanner;

public class Exercise06_20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    System.out.println("The number of letters is " + countLetters(str));
  }

  public static int countLetters(String s) {
    int countLetters = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i)))
        countLetters++;
    }
    return countLetters;
  }
}

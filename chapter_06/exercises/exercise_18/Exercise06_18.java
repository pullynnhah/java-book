package chapter_06.exercises.exercise_18;

import java.util.Scanner;

public class Exercise06_18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string for password: ");
    String password = scanner.next();

    System.out.println((isPasswordValid(password) ? "Valid" : "Invalid") + " Password");

  }

  public static boolean isPasswordValid(String password) {
    final int PASSWORD_MIN_LENGTH = 8;
    if (password.length() < PASSWORD_MIN_LENGTH)
      return false;

    int digitsCount = 0;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if (!Character.isLetterOrDigit(ch))
        return false;
      if (Character.isDigit(ch))
        digitsCount++;
    }

    return digitsCount >= 2;
  }
}

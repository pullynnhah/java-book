package chapter_04.exercises.exercise_12;

import java.util.Scanner;

public class Exercise04_12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a hex digit: ");
    String hexString = scanner.nextLine();

    if (hexString.length() != 1) {
      System.out.println("You must enter exactly one character");
      return;
    }

    char ch = Character.toUpperCase(hexString.charAt(0));

    String result = "The binary value is ";
    switch (ch) {
      case '0' -> result += "0000";
      case '1' -> result += "0001";
      case '2' -> result += "0010";
      case '3' -> result += "0011";
      case '4' -> result += "0100";
      case '5' -> result += "0101";
      case '6' -> result += "0110";
      case '7' -> result += "0111";
      case '8' -> result += "1000";
      case '9' -> result += "1001";
      case 'A' -> result += "1010";
      case 'B' -> result += "1011";
      case 'C' -> result += "1100";
      case 'D' -> result += "1101";
      case 'E' -> result += "1110";
      case 'F' -> result += "1111";
      default -> result = ch + "is an invalid input";
    }

    System.out.println(result);
  }
}

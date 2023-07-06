package chapter_05.exercises.exercise_44;

import java.util.Scanner;

public class Exercise05_44 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    short number = scanner.nextShort();

    String bit = "";
    for (int i = 0; i < 16; i++) {
      bit = (number & 1) + bit;
      number >>= 1;
    }
    System.out.print("The 16 bits are " + bit);

  }
}

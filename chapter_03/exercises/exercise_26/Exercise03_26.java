package chapter_03.exercises.exercise_26;

import java.util.Scanner;

public class Exercise03_26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();

    boolean isDivisibleBy5 = number % 5 == 0;
    boolean isDivisibleBy6 = number % 6 == 0;
    System.out.println("Is " + number  +" divisible by 5 and 6? "
      + (isDivisibleBy5 && isDivisibleBy6));

    System.out.println("Is " + number  +" divisible by 5 or 6? "
      + (isDivisibleBy5 || isDivisibleBy6));

    System.out.println("Is " + number  +" divisible by 5 or 6, but not both? "
      + (isDivisibleBy5 ^ isDivisibleBy6));
  }
}

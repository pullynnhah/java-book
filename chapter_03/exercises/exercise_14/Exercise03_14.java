package chapter_03.exercises.exercise_14;

import java.util.Scanner;

public class Exercise03_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int coin = Math.random() < 0.5 ? 0 : 1;

    System.out.print("Guess head or tail? Enter 0 for head and 1 for tail: ");
    int guess = scanner.nextInt();

    if (coin == guess) {
      System.out.println("Correct guess");
    } else if (coin == 0) {
      System.out.println("Sorry, it is a head");
    } else {
      System.out.println("Sorry, it is a tail");
    }
  }
}

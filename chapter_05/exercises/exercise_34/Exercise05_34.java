package chapter_05.exercises.exercise_34;

import java.util.Scanner;

public class Exercise05_34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int computerWins = 0;
    int playerWins = 0;
    while (Math.abs(computerWins - playerWins) != 2) {

      int computer = (int) (Math.random() * 3);
      String computerPlay;
      switch (computer) {
        case 0 -> computerPlay = "scissor";
        case 1 -> computerPlay = "rock";
        case 2 -> computerPlay = "paper";
        default -> throw new IllegalStateException("Unexpected value: " + computer);
      }

      System.out.print("scissor (0), rock (1), paper (2): ");
      int player = scanner.nextInt();
      String playerPlay;
      switch (player) {
        case 0 -> playerPlay = "scissor";
        case 1 -> playerPlay = "rock";
        case 2 -> playerPlay = "paper";
        default -> throw new IllegalStateException("Unexpected value: " + player);
      }

      System.out.printf("The computer is %s. You are %s. ", computerPlay, playerPlay);

      if (player == computer) {
        System.out.println("It is a draw");
      } else if (player == 0) {
        if (computer == 1) {
          System.out.println("You lost");
          computerWins++;
        } else {
          System.out.println("You win");
          playerWins++;
        }
      } else if (player == 1) {
        if (computer == 0) {
          System.out.println("You win");
          playerWins++;
        } else {
          System.out.println("You lost");
          computerWins++;
        }
      } else {
        if (computer == 0) {
          System.out.println("You lost");
          computerWins++;
        } else {
          System.out.println("You win");
          playerWins++;
        }
      }
    }

    if (computerWins - playerWins == 2)
      System.out.println("Computer wins");
    else
      System.out.println("You win");
  }
}

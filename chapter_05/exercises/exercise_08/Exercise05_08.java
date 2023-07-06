package chapter_05.exercises.exercise_08;

import java.util.Scanner;

public class Exercise05_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int numberOfStudents = scanner.nextInt();

    String maxName = "";
    double maxScore = 0;
    for (int i = 1; i <= numberOfStudents; i++) {
      System.out.print("Enter student's name: ");
      String name = scanner.next();

      System.out.print("Enter " + name + " score: ");
      double score = scanner.nextDouble();

      if (score > maxScore) {
        maxName = name;
        maxScore = score;
      }
    }

    System.out.printf("\n%s score is %.2f\n", maxName, maxScore);
  }
}

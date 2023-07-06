package chapter_05.exercises.exercise_42;

import java.util.Scanner;

public class Exercise05_42 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Commission: ");
    double commissionSought = scanner.nextDouble();

    int sales;
    double commission = 0;
    for (sales = 1; commission < commissionSought; sales++) {
      if (sales < 5000) commission = sales * 0.08;
      else if (sales < 10_000) commission = 5000 * 0.08 + (sales - 5000) * 0.1;
      else commission = 10_000 * 0.18 + (sales - 10_000) * 0.12;
    }

    System.out.printf("The sales of %d is needed for a commission of %.2f\n", sales, commission);
  }
}

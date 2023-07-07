package chapter_06.exercises.exercise_14;

public class Exercise06_14 {
  public static void main(String[] args) {
    System.out.printf("%-20c%-20s\n", 'i', "m(i)");
    for (int i = 1; i <= 901; i += 100) {
      System.out.printf("%-20d%-20.4f\n", i, m(i));
    }
  }

  public static double m(int i) {
    double sum = 0;
    for (int j = 1; j <= i; j++) {
      sum += Math.pow(-1, j + 1) / (j * 2 - 1);
    }

    return 4 * sum;
  }
}

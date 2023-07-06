package chapter_05.exercises.exercise_06;

public class Exercise05_06 {
  public static void main(String[] args) {
    final double KILOMETERS_PER_MILE = 1.609;
    System.out.println("Miles   Kilometers   |   Kilometers   Miles");
    for (int i = 1, j = 20; i < 11; i++, j += 5) {
      System.out.printf("%-5d   %-10.3f   |   %-10d   %.3f\n",
        i, i * KILOMETERS_PER_MILE, j, j / KILOMETERS_PER_MILE);
    }
  }
}

package chapter_05.exercises.exercise_26;

public class Exercise05_26 {
  public static void main(String[] args) {
    double e = 1;
    double item = 1;
    for (int i = 1; i <= 20; i++) {
      item /= i;
      e += item;
    }

    System.out.printf("e is %.16f", e);
  }
}

package chapter_05.exercises.exercise_04;

public class Exercise05_04 {
  public static void main(String[] args) {
    final double KILOMETERS_PER_MILE = 1.609;
    
    System.out.println("Miles   Kilometers");
    for (int i = 1; i < 11; i++) {
      System.out.printf("%-5d   %.3f\n", i, i * KILOMETERS_PER_MILE);
    }
  }
}

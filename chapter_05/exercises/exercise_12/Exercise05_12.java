package chapter_05.exercises.exercise_12;

public class Exercise05_12 {
  public static void main(String[] args) {
    final int MAX = 12000;
    int n = 1;

    while (Math.pow(n, 2) <= MAX) n++;
    System.out.println("n is " + n);
  }
}

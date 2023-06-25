package chapter_04.exercises.exercise_16;

public class Exercise04_16 {
  public static void main(String[] args) {
    char randomChar = (char) ('A' + (int) (Math.random() * ('Z' - 'A' + 1)));
    System.out.printf("The random char is: '%c'\n", randomChar);
  }
}

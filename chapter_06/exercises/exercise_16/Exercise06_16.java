package chapter_06.exercises.exercise_16;

public class Exercise06_16 {
  public static void main(String[] args) {
    for (int year = 2000; year <= 2020; year++) {
      System.out.printf("%d -> %d days\n", year, numberOfDaysInAYear(year));
    }
  }

  public static int numberOfDaysInAYear(int year) {
    return isLeapYear(year) ? 366 : 365;
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}

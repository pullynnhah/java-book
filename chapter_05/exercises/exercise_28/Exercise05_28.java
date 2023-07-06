package chapter_05.exercises.exercise_28;

import java.util.Scanner;

public class Exercise05_28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    System.out.print("Enter the first day of the year: ");
    int firstDay = scanner.nextInt();

    boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

    int monthlyDays = 0;
    for (int month = 0; month < 12; month++) {
      System.out.print(
        switch (month) {
          case 0 -> "January";
          case 1 -> "February";
          case 2 -> "March";
          case 3 -> "April";
          case 4 -> "May";
          case 5 -> "June";
          case 6 -> "July";
          case 7 -> "August";
          case 8 -> "September";
          case 9 -> "October";
          case 10 -> "November";
          case 11 -> "December";
          default -> throw new IllegalStateException("Unexpected value: " + month);
        }
      );

      boolean has31Days = month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11;
      System.out.print(" 1, " + year + " is ");
      firstDay = (firstDay + monthlyDays) % 7;

      System.out.println(
        switch (firstDay) {
          case 0 -> "Sunday";
          case 1 -> "Monday";
          case 2 -> "Tuesday";
          case 3 -> "Wednesday";
          case 4 -> "Thursday";
          case 5 -> "Friday";
          case 6 -> "Saturday";
          default -> throw new IllegalStateException("Unexpected value: " + firstDay);
        }
      );
      if (month == 1 && isLeapYear)
        monthlyDays = 29;
      else if (month == 1)
        monthlyDays = 28;
      else if (has31Days)
        monthlyDays = 31;
      else
        monthlyDays = 30;
    }
  }
}

package chapter_06.exercises.exercise_34;

import java.util.Scanner;

public class Exercise06_34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter full year (e.g., 2001): ");
    int year = input.nextInt();
    System.out.print("Enter month in number between 1 and 12: ");
    int month = input.nextInt();

    printMonth(year, month);
  }

  public static void printMonth(int year, int month) {
    printMonthTitle(year, month);
    printMonthBody(year, month);
  }

  public static void printMonthTitle(int year, int month) {
    System.out.println("         " + getMonthName(month)
      + " " + year);
    System.out.println("-----------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }


  public static String getMonthName(int month) {
    switch (month) {
      case 1 -> {
        return "January";
      }
      case 2 -> {
        return "February";
      }
      case 3 -> {
        return "March";
      }
      case 4 -> {
        return "April";
      }
      case 5 -> {
        return "May";
      }
      case 6 -> {
        return "June";
      }
      case 7 -> {
        return "July";
      }
      case 8 -> {
        return "August";
      }
      case 9 -> {
        return "September";
      }
      case 10 -> {
        return "October";
      }
      case 11 -> {
        return "November";
      }
      case 12 -> {
        return "December";
      }

      default -> throw new IllegalStateException("Unexpected value: " + month);
    }
  }

  public static void printMonthBody(int year, int month) {
    int startDay = getStartDay(year, month);
    int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

    for (int i = 0; i < startDay; i++)
      System.out.print("    ");

    for (int i = 1; i < numberOfDaysInMonth; i++) {
      System.out.printf("%4d", i);
      if ((i + startDay) % 7 == 0)
        System.out.println();
    }

    System.out.println();
  }

  public static int getStartDay(int year, int month) {
    if (month <= 2) {
      month += 12;
      year--;
    }

    int dayOfMonth = 1;
    return (int) (dayOfMonth + 2.6 * (month + 1) + 1.25 * (year % 100) + 0.0525 * year + 1) % 7;
  }

  public static int getNumberOfDaysInMonth(int year, int month) {
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
      month == 8 || month == 10 || month == 12)
      return 31;

    if (month == 4 || month == 6 || month == 9 || month == 11)
      return 30;
    if (month == 2) return isLeapYear(year) ? 29 : 28;

    return 0;
  }

  public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}

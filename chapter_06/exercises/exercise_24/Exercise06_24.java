package chapter_06.exercises.exercise_24;

public class Exercise06_24 {
  public static void main(String[] args) {
    System.out.println("Current date and time is " + getCurrentDateTime());
  }

  public static String getCurrentDateTime() {
    final int SECONDS_PER_DAY = 86400;
    long seconds = System.currentTimeMillis() / 1000;

    int daysSinceEpoch = (int) (seconds / SECONDS_PER_DAY);
    int secondsToday = (int) (seconds % SECONDS_PER_DAY);
    return getCurrentDate(daysSinceEpoch) + " " + getCurrentTime(secondsToday);
  }

  public static String getCurrentDate(int days) {
    int year = getCurrentYear(days);
    int month = getCurrentMonth(year, days - getTotalDaysInYears(year));
    int day = getCurrentDay(year, month, days - getTotalDaysInYears(year));
    return month + "/" + day + "/" + year;
  }

  public static int getTotalDaysInYears(int year) {
    int totalDays = 0;
    for (int i = 1970; i < year; i++) {
      totalDays += getNumberOfDaysInYear(i);
    }
    return totalDays;
  }

  public static int getNumberOfDaysInYear(int year) {
    return isLeapYear(year) ? 366 : 365;
  }

  public static int getCurrentYear(int days) {
    int year = 1970;
    int daysPerYear = getNumberOfDaysInYear(year);

    while (days > daysPerYear) {
      year++;
      days -= daysPerYear;
      daysPerYear = getNumberOfDaysInYear(year);
    }

    return year;
  }

  public static int getCurrentMonth(int year, int days) {
    int month = 1;
    do {

      days -= getNumberOfDaysInMonth(year, month++);
    } while (days >= 0);
    return month - 1;
  }

  public static int getCurrentDay(int year, int month, int days) {
    int total = 0;
    for (int i = 1; i < month; i++) {
      total += getNumberOfDaysInMonth(year, i);
    }
    return days + 1 - total;
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

  public static String getCurrentTime(int seconds) {
    final int SECONDS_PER_MINUTE = 60;
    final int MINUTES_PER_HOUR = 60;
    final int HOURS_PER_DAY = 24;

    int dateSeconds = seconds % SECONDS_PER_MINUTE;
    int dateMinutes = seconds / SECONDS_PER_MINUTE % MINUTES_PER_HOUR;
    int dateHours = seconds / SECONDS_PER_MINUTE / MINUTES_PER_HOUR % HOURS_PER_DAY;
    return dateHours + ":" + dateMinutes + ":" + dateSeconds + " GMT";
  }


  public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}

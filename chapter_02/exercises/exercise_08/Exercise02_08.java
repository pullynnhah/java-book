package chapter_02.exercises.exercise_08;

import java.util.Scanner;

public class Exercise02_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the time zone offset to GMT: ");
    int offset = scanner.nextInt();

    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;
    long totalMinutes = totalSeconds / 60;
    long totalHours = totalMinutes / 60;

    long currentSecond = totalSeconds % 60;
    long currentMinute = totalMinutes % 60;
    long currentHour = (totalHours + offset) % 24;


    System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}

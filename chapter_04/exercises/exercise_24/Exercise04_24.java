package chapter_04.exercises.exercise_24;

import java.util.Scanner;

public class Exercise04_24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first city: ");
    String city1 = scanner.nextLine();

    System.out.print("Enter the second city: ");
    String city2 = scanner.nextLine();

    System.out.print("Enter the third city: ");
    String city3 = scanner.nextLine();



    if (city1.compareTo(city2) > 0) {
      String temp = city1;
      city1 = city2;
      city2 = temp;
    }

    if (city1.compareTo(city3) > 0) {
      String temp = city1;
      city1 = city3;
      city3 = temp;
    }

    if (city2.compareTo(city3) > 0) {
      String temp = city2;
      city2 = city3;
      city3 = temp;
    }

    System.out.printf("The three cities in alphabetical order are %s %s %s\n",
      city1, city2, city3);
  }
}

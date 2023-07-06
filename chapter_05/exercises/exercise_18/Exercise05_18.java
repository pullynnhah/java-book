package chapter_05.exercises.exercise_18;

public class Exercise05_18 {
  public static void main(String[] args) {
    System.out.println("Pattern A:");
    for (int i = 0; i < 6; i++) {
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("\nPattern B:");
    for (int i = 0; i < 6; i++) {
      for (int j = 1; j <= 6 - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("\nPattern C:");
    for (int i = 0; i < 6; i++) {
      for (int j = 6; j >= 1; j--) {
        if (j > i + 1) System.out.print(" ");
        else System.out.print(j);
        System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println("\nPattern D:");
    for (int i = 0; i < 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (j < i + 1) System.out.print(" ");
        else System.out.print(j);
        System.out.print(" ");
      }
      System.out.println();
    }

  }
}

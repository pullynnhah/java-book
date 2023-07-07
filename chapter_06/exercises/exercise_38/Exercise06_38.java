package chapter_06.exercises.exercise_38;

public class Exercise06_38 {
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 50; j++) {
        System.out.print(RandomCharacter.getRandomUpperCaseLetter());
      }
      System.out.println();
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 50; j++) {
        System.out.print(RandomCharacter.getRandomDigitCharacter());
      }
      System.out.println();
    }
  }
}

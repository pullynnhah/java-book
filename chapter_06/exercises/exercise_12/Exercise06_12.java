package chapter_06.exercises.exercise_12;

public class Exercise06_12 {
  public static void main(String[] args) {
    printChars('1', 'z', 10);
  }

  public static void printChars(char ch1, char ch2, int numberPerLine) {
    for (char ch = ch1; ch <= ch2; ch++) {
      if ((ch - ch1 + 1) % numberPerLine == 0)
        System.out.println(ch);
      else
        System.out.print(ch + " ");
    }
  }

}

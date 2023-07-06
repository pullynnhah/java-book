package chapter_05.exercises.exercise_40;

public class Exercise05_40 {
  public static void main(String[] args) {
    int heads = 0;
    int tails = 0;
    for (int i = 0; i < 1_000_000; i++) {
      int coin = (int) (Math.random() * 2);
      switch (coin) {
        case 0 -> heads++;
        case 1 -> tails++;
      }
    }

    System.out.println("head count: " + heads);
    System.out.println("tail count: " + tails);
  }
}

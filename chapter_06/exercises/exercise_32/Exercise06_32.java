package chapter_06.exercises.exercise_32;

public class Exercise06_32 {
  public static void main(String[] args) {
    final int ROUNDS = 10_000;
    int wins = 0;
    for (int i = 0; i < ROUNDS; i++) {
      if (isWinnerCraps())
        wins++;
    }

    System.out.printf("You won %d/%d", wins, ROUNDS);
  }

  public static boolean isWinnerCraps() {
    int die1 = rollDie(6);
    int die2 = rollDie(6);
    int sum = die1 + die2;

    if (sum == 2 || sum == 3 || sum == 12)
      return false;

    if (sum == 7 || sum == 11)
      return true;

    int point = sum;

    do {
      die1 = rollDie(6);
      die2 = rollDie(6);
      sum = die1 + die2;

    } while (sum != 7 && sum != point);

    return sum == point;
  }

  public static int rollDie(int faces) {
    return (int) (Math.random() * faces + 1);
  }
}

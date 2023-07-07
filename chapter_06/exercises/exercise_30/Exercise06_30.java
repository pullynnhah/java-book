package chapter_06.exercises.exercise_30;

public class Exercise06_30 {
  public static void main(String[] args) {
    int die1 = rollDie(6);
    int die2 = rollDie(6);
    int sum = die1 + die2;

    displayPlay(die1, die2, sum);
    if (sum == 2 || sum == 3 || sum == 12) {
      System.out.println("You lose");
      return;
    }
    if (sum == 7 || sum == 11) {
      System.out.println("You win");
      return;
    }

    int point = sum;
    System.out.println("point is " + point);

    do {
      die1 = rollDie(6);
      die2 = rollDie(6);
      sum = die1 + die2;
      displayPlay(die1, die2, sum);

    } while (sum != 7 && sum != point);

    System.out.println("You " + ((sum == 7) ? "lose" : "win"));
  }

  public static void displayPlay(int die1, int die2, int sum) {
    System.out.printf("You rolled %d + %d = %d\n", die1, die2, sum);
  }

  public static int rollDie(int faces) {
    return (int) (Math.random() * faces + 1);
  }
}

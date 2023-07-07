package chapter_06.exercises.exercise_10;

public class Exercise06_10 {
  public static void main(String[] args) {
    final int MAX = 10_000;
    int primeCount = 0;
    for (int i = 2; i <= MAX; i++) {
      if (isPrime(i)) primeCount++;
    }

    System.out.println("The number of prime numbers < " + MAX + " is: " + primeCount);
  }

  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }
    return true;
  }
}

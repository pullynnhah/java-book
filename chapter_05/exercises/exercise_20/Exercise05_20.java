package chapter_05.exercises.exercise_20;

public class Exercise05_20 {
  public static void main(String[] args) {
    final int START_NUMBER = 2;
    final int END_NUMBER = 1000;
    final int NUMBER_OF_PRIMES_PER_LINE = 8;
    int count = 0;
    int number = 2;

    System.out.printf("List of prime numbers between [%d, %d]:\n", START_NUMBER, END_NUMBER);

    while (number < END_NUMBER) {
      boolean isPrime = true;

      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        count++;

        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          System.out.println(number);
        } else
          System.out.print(number + " ");
      }
      number++;
    }
  }
}

package chapter_06.exercises.exercise_28;

public class Exercise06_28 {
  public static void main(String[] args) {
    System.out.printf("%-8c%-8s\n", 'p', "2^p - 1");
    for (int i = 2; i < 32; i++) {
      long mersenneNumber = (long) Math.pow(2, i) - 1;
      if (isPrime(mersenneNumber))
        System.out.printf("%-8d%-8d\n", i, mersenneNumber);
    }
  }

  public static boolean isPrime(long number) {
    for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
      if (number % i == 0)
        return false;
    }

    return true;
  }
}

package chapter_06.exercises.exercise_26;

public class Exercise06_26 {
  public static void main(String[] args) {
    displayPalindromicPrime(100);
  }

  public static void displayPalindromicPrime(int numOfPalindromicPrimes) {
    final int NUMBERS_PER_LINE = 10;

    int count = 0;
    int number = 2;
    do {
      if (isPalindromicPrime(number)) {
        if (++count % 10 == 0)
          System.out.println(number);
        else
          System.out.print(number + " ");
      }
      number++;
    } while (count < numOfPalindromicPrimes);

  }

  public static boolean isPalindromicPrime(int number) {
    return isPrime(number) && isPalindrome(number);
  }

  public static boolean isPrime(int number) {
    for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
      if (number % i == 0)
        return false;
    }

    return true;
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  public static int reverse(int number) {
    int reverseNumber = 0;
    do {
      reverseNumber = number % 10 + 10 * reverseNumber;
      number /= 10;
    } while (number != 0);
    return reverseNumber;
  }
}

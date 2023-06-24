package chapter_03.exercises.exercise_24;

public class Exercise03_24 {
  public static void main(String[] args) {
    int randomCard = (int)(Math.random() * 52);

    System.out.print("The card you picked is ");

    int cardIndex = randomCard % 13;
    if (cardIndex == 0)
      System.out.print("Ace");
    else if (cardIndex == 10)
      System.out.print("Jack");
    else if (cardIndex == 11)
      System.out.print("Queen");
    else if (cardIndex == 12)
      System.out.print("King");
    else
      System.out.print(cardIndex + 1);

    int suitIndex = randomCard / 13;

    if (suitIndex == 0)
      System.out.println(" of Clubs");
    else if (suitIndex == 1)
      System.out.println(" of Diamonds");
    else if (suitIndex == 2)
      System.out.println(" of Hearts");
    else if (suitIndex == 3)
      System.out.println(" of Spades");
  }
}

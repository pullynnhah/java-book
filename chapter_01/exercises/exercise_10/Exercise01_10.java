package chapter_01.exercises.exercise_10;

public class Exercise01_10 {
  public static void main(String[] args) {
    /*
     * 1. km ~> mi: (A)
     *    14 km * (1 mi / 1.6 km) => (14 / 1.6) mi
     *
     * 2. min ~> h: (B)
     *    45.0 min * (1 h / 60 min) => (45.0 / 60) h
     *
     * 3. sec ~> h: (C)
     *    30.0 sec * (1 h / 3600 sec) => (30.0 / 3600) h
     *
     * 4. distance = A:
     *    distance = 14 / 1.6
     *
     * 5. time =  B + C:
     *    time = 45.0 / 60 + 30.0 / 3600
     *
     * 6. averageVelocity = distance / time
     */
    System.out.println("MPH = " + ((14 / 1.6) / (45.0 / 60 + 30.0 / 3600)));
  }
}

package chapter_01.exercises.exercise_12;

public class Exercise01_12 {
  public static void main(String[] args) {
    /*
     * 1. mi ~> km: (A)
     *    24 mi * (1.6 km / 1 mi) => (24 * 1.6) km
     *
     * 2. h: (B)
     *    (1) h
     *
     * 3. min ~> h: (C)
     *    40.0 min * (1 h / 60 min) => (40.0 / 60) h
     *
     * 4. sec ~> h: (D)
     *    35.0 sec * (1 h / 3600 sec) => (35.0 / 3600) h
     *
     * 4. distance = A:
     *    distance = 24 * 1.6
     *
     * 5. time =  A + B + C:
     *    time = 1 + 40.0 / 60 + 35.0 / 3600
     *
     * 6. averageVelocity = distance / time
     */
    System.out.println((24 * 1.6) / (1 + 40.0 / 60 + 35.0 / 3600));
  }
}

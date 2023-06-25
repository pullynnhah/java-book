package chapter_04.exercises.exercise_06;

public class Exercise04_06 {
  public static void main(String[] args) {
    final int RADIUS = 40;

    double circleAngle1 = Math.PI * Math.random() * 2;
    double x1 = RADIUS * Math.cos(circleAngle1);
    double y1 = RADIUS * Math.sin(circleAngle1);

    double circleAngle2 = Math.PI * Math.random() * 2;
    double x2 = RADIUS * Math.cos(circleAngle2);
    double y2 = RADIUS * Math.sin(circleAngle2);

    double circleAngle3 = Math.PI * Math.random() * 2;
    double x3 = RADIUS * Math.cos(circleAngle3);
    double y3 = RADIUS * Math.sin(circleAngle3);

    double side1 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double side2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    double side3 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    double angle1 = Math.acos((Math.pow(side2, 2)
      + Math.pow(side3, 2) - Math.pow(side1, 2))
      / (2 * side2 * side3));

    double angle2 = Math.acos((Math.pow(side1, 2)
      + Math.pow(side3, 2) - Math.pow(side2, 2))
      / (2 * side1 * side3));

    double angle3 = Math.acos((Math.pow(side1, 2)
      + Math.pow(side2, 2) - Math.pow(side3, 2))
      / (2 * side1 * side2));

    System.out.printf("Point 1: (%.2f, %.2f) - ∠%.2f rad\n", x1, y1, angle1);
    System.out.printf("Point 2: (%.2f, %.2f) - ∠%.2f rad\n", x2, y2, angle2);
    System.out.printf("Point 3: (%.2f, %.2f) - ∠%.2f rad\n", x3, y3, angle3);
  }
}

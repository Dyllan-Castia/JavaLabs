public class ShapeMetricCalculator {
  //Methods are static so that they can be called by main using other class objects as arguments.
    public static double calculateRectangleArea(Rectangle rect) {
        return rect.length * rect.width;
    }

    public static double calculateCircleArea(Circle cir) {
        return (3.14 * (cir.radius * cir.radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        Circle circle = new Circle(5.0);

        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("Area of Rectangle: " + areaOfRectangle + " sq inches.");
        System.out.println("Area of Circle: " + areaOfCircle + " sq inches.");
    }
}

//Area of Rectangle: 15.0 sq inches.
//Area of Circle: 78.5 sq inches.

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Rectangle> rectangles = Arrays.asList(new Rectangle(2, 3), new Rectangle(4, 5));
        List<Circle> circles = Arrays.asList(new Circle(2), new Circle(3));

        System.out.println("Total area of rectangles: " + totalArea(rectangles));
        System.out.println("Total area of circles: " + totalArea(circles));
    }

    // T must be of type Shape
    public static <T extends Shape> double totalArea(List<T> shapes) {
        double totalArea = 0;
        for (T shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}


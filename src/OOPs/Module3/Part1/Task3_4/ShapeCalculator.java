package OOPs.Module3.Part1.Task3_4;

// ShapeCalculator.java
public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator");

        // Creating an array of Shape objects
        Shape[] shapes = {
                new Circle(5.0, "Red"),
                new Rectangle(4.0, 6.0, "Blue"),
                new Triangle(3.0, 8.0, "Green")
        };

        // Loop through the array and display the area and color of each shape
        for (Shape shape : shapes) {
            // Check the type of the shape and cast it accordingly
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area of Circle with " + circle.getColor() +
                        " color: " + circle.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area of Rectangle with " + rectangle.getColor() +
                        " color: " + rectangle.calculateArea());
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("Area of Triangle with " + triangle.getColor() +
                        " color: " + triangle.calculateArea());
            }
        }
    }
}




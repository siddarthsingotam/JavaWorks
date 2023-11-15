package OOPs.Module3.Part1.Task3;

// ShapeCalculator.java
public class ShapeCalculator {
    public static void main(String[] args) {
        double radius = 5;
        double rec_width = 4;
        double rec_height = 6;
        double tri_base = 3;
        double tri_height = 8;

        System.out.println("Shape Calculator\n");


        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(rec_width,rec_height);
        Shape triangle = new Triangle(tri_base, tri_height);


        System.out.println("Area of Circle with radius " + radius + ": " + circle.calculateArea());
        System.out.println("Area of Rectangle width" + rec_width + "and height " + rec_height + ": " + rectangle.calculateArea());
        System.out.println("Area of Triangle base" + tri_base + "and height " + tri_height + ": " + triangle.calculateArea());

    }
}

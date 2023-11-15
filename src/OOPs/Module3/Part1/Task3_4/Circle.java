package OOPs.Module3.Part1.Task3_4;

// Circle.java
public class Circle extends Shape {
    private double radius;

    // Added color as a property
    private String color;

    // Constructor with radius and color parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Implementing calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

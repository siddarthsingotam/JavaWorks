package OOPs.Module3.Part1.Task3_4;

// Triangle.java
public class Triangle extends Shape {
    private double base;
    private double height;

    // Added color as a property
    private String color;

    // Constructor with base, height, and color parameters
    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Implementing calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}



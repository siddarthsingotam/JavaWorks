package OOPs.Module3.Part1.Task3_4;

// Rectangle.java
public class Rectangle extends Shape {
    private double width;
    private double height;

    // Added color as a property
    private String color;

    // Constructor with width, height, and color parameters
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Implementing calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}



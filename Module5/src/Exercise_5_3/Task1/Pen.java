package Exercise_5_3.Task1;

import java.util.Objects;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color currentColor;
    private boolean capOn;

    public Pen() {
        this(Color.RED);
    }

    public Pen(Color initialColor) {
        this.currentColor = initialColor;
        this.capOn = true;
    }

    public String draw() {
        if (capOn) {
            return "";
        } else {
            return "Drawing " + currentColor;
        }
    }

    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public void changeColor(Color newColor) {
        if (!capOn) {
            // Only change color when cap is on
            currentColor = newColor;
        }
    }

    // Override equals and hashCode for testing purposes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return capOn == pen.capOn && currentColor == pen.currentColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentColor, capOn);
    }
}

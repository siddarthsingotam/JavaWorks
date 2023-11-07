package OOPs.Module2.Part1;

import OOPs.Module2.Part1.Point;

public class pointyPointer {
    /* Sqrt() calculation using Newton-Raphson method to demonstrate the while-loop
     * See https://en.wikipedia.org/wiki/Newton%27s_method or https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf
     */
    public static double sqrt(double a) {
        double x = a / 2;                       // Initial quess for the square root
        double eps = 4 * Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {      // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                    // Improve the estimate x for the square root
        }

        return (x);
    }

    public static void main(String[] args) {
        Point p0 = new Point(0, 0, 0);
        Point p1 = new Point(11, 12, 13);
        Point p2 = new Point(23, 24, 25);

        System.out.println("The distance between points 1 and 2 is " + p1.distance(p2));
        System.out.println("The distance between point 1 and origin is " + p1.distance(p0));
    }
}
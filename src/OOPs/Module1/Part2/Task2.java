package OOPs.Module1.Part2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double firstLeg, secondLeg, hypotenuse;

        // Taking the short legs of the triangle.
        System.out.print("Enter the first leg: ");
        firstLeg = reader.nextDouble();

        System.out.print("Enter the second leg: ");
        secondLeg = reader.nextDouble();

        // Third Leg formula
        hypotenuse = Math.sqrt((Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2)));

        System.out.printf("Hypotenuse length in units: %.2f", hypotenuse);

        reader.close();
    }
}

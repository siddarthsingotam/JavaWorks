package OOPs.Module1.Part2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for the conversion rates
        final int NAULA_PER_LEIVISKA = 20;
        final int LUOTI_PER_NAULA = 32;
        final double GRAMS_PER_LUOTI = 13.28;

        System.out.print("Weight (g): ");
        double weightInGrams = scanner.nextDouble();
        double weightInGramsDisplay = weightInGrams;

        // Perform the conversion
        int leiviska = (int) (weightInGrams / (NAULA_PER_LEIVISKA * LUOTI_PER_NAULA * GRAMS_PER_LUOTI));
        weightInGrams -= leiviska * NAULA_PER_LEIVISKA * LUOTI_PER_NAULA * GRAMS_PER_LUOTI;

        int naula = (int) (weightInGrams / (LUOTI_PER_NAULA * GRAMS_PER_LUOTI));
        weightInGrams -= naula * LUOTI_PER_NAULA * GRAMS_PER_LUOTI;

        double luoti = weightInGrams / GRAMS_PER_LUOTI;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n", weightInGramsDisplay, leiviska, naula, luoti);

        scanner.close();
    }
}

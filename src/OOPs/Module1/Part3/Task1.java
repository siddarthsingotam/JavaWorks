package OOPs.Module1.Part3;

import java.util.Scanner;

public class Task1 {
    private static double disc(double a, double b, double c){
        double D = Math.pow(b, 2) - 4*a*c;

        return D;
    }

    private static boolean checkRoots(double discriminant) {
        return discriminant >= 0;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first coefficient a: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.println("Enter the first coefficient b: ");
        double b = Double.parseDouble(reader.nextLine());

        System.out.println("Enter the first coefficient c: ");
        double c = Double.parseDouble(reader.nextLine());

        // Calculating Discriminant
        double D = disc(a, b, c);

        // Checking roots exist
        boolean response = checkRoots(D);


        if (response){
            double root1 = (-b + Math.sqrt(D))/2*a;
            double root2 = (-b - Math.sqrt(D))/2*a;

            System.out.println("\nThe roots exists!");
            System.out.println("roots: " + root1 + " ," + root2);
        }

        else {
            System.out.println("No roots!");
        }

    }
}

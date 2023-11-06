package OOPs.Module1.Part3;

import java.util.Scanner;

public class himan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rootA, rootB;

        System.out.println("Provide coefficient a: ");
        double coffA = Double.parseDouble(scanner.nextLine());

        System.out.println("Provide coefficient b: ");
        double coffB = Double.parseDouble(scanner.nextLine());

        System.out.println("Provide coefficient c: ");
        double coffC = Double.parseDouble(scanner.nextLine());

        double rootTerm = (Math.pow(coffB, 2) - (4 * coffA * coffC));

        if (rootTerm < 0) {
            System.out.println("The equation has no real solutions");
        } else if (rootTerm == 1) {
            rootA = (-coffB + rootTerm) / (2 * coffA);
            rootB = (-coffB - rootTerm) / (2 * coffA);
            System.out.printf("x=%.2f , x=%.2f", rootA, rootB);
        } else {
            rootA = (-coffB + Math.sqrt(rootTerm)) / (2 * coffA);
            rootB = (-coffB - Math.sqrt(rootTerm)) / (2 * coffA);
            System.out.printf("x=%.2f , x=%.2f", rootA, rootB);
        }
    }
}

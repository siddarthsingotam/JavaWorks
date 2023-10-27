package Module1.Part2;

import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = Integer.parseInt(scanner.nextLine());

        double doubleValue = (double)intValue / 2;
        // double doubleValue = Double.parseDouble(intValue);


        System.out.println("The result is " + doubleValue);

        scanner.close();
    }
}

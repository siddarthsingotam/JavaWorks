package OOPs.Module1.Part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        double faren;

        System.out.print("Enter temp in Fahrenheit: ");
        faren = reader.nextDouble();

        double celcius = (faren - 32)*5/9;

        System.out.printf("Thew temperature in Celcius is: %.1f C", celcius);

        reader.close();

    }
}

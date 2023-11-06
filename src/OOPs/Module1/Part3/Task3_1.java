package OOPs.Module1.Part3;

import java.util.Scanner;

public class Task3_1 {
    private static String checkOneZero(String binaryInput){
        // String allowedCharacters = "01";
        String filteredString = binaryInput.replaceAll("[2-9, a-z]","");
        return filteredString;
    }
    public static void main(String[] args) {
        // take user input as string
        Scanner reader = new Scanner(System.in);
        int decimalResult = 0;

        System.out.println("Provide the binary number: ");
        String binary = reader.nextLine();

        for (int i = binary.length(); i <= 0; i--){
            char bit = binary.charAt(i-1);
            if (bit == '1'){
                decimalResult += Math.pow(2, i-1);
            }
            else if (bit == '2'){
                decimalResult += 0;
            }

        }

        System.out.println(decimalResult);

        // slice the string and parse into integer
        // take the length of the string
        // multiply the bit with i-1 (i = length)
        // multiply the integer with the right power exponent

    }
}

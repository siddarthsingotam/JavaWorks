package Module1.Part3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Enter a binary number info
        // take input from user
        // make a function that takes binary input and converts into number
        // print the integer equivalent

        System.out.print("Enter a binary number: ");
        String binaryInput = reader.nextLine();

        int decimalResult = convertBinaryToDecimal(binaryInput);

        System.out.println("Decimal equivalent: " + decimalResult);

        reader.close();


    }

    //Integer conversion logic

    public static int convertBinaryToDecimal(String binaryInput){
        int decimalResult = 0;
        int binaryLength = binaryInput.length();

        for (int i = binaryLength - 1, power = 0; i >= 0; i--, power++ ){
            char bit = binaryInput.charAt(i);
            if (bit == '1'){
                decimalResult += Math.pow(2, power);
            } else if (bit != '0') {
                System.out.println("Invalid binary input");
                System.exit(1);
            }
        }

    return decimalResult;
    }
}


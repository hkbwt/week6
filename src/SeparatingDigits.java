/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Danielle
 */
public class SeparatingDigits {

    public void separateDigit() {

        Scanner sc = new Scanner(System.in);
        int userNum = -1;

        do {
            System.out.print("Enter an integer of more than 1 digits or a negative integer to exit: ");
            try {
                userNum = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Try again...");
                continue;
            }


            if (userNum < 1) {
                break; // break loop pls
            }
            if (userNum > 99_999) {
                System.out.println("Number must be less than 99,999");
                System.out.println("Try again...");
                continue;
            }
            if (digitCount(userNum) < 2) {
                System.out.println("Number must be an integer of more than 1 digits");
                System.out.println("Try again...");
                continue;
            }

            displayDigits(userNum);
        } while (true); // Wait for user to break loop :nervous_pepe:

        System.out.println("Good bye!");
    }

    public int quotient(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public void displayDigits(int num) {

        int numDigitCount = digitCount(num);
        int divide = 1;
        int digit;
        var result = "";

        for (int i = 1; i < num; i *= 10) {
            divide = i;
        }

        while (divide > 0) {
            digit = quotient(num, divide);
            int divideDigitCount = digitCount(divide);

            if (divideDigitCount == numDigitCount) {
                result = Integer.toString(digit); // First digit exception
            } else {
                result = result + " " + digit;
            }


            num = remainder(num, divide);
            divide = quotient(divide, 10);
        }

        System.out.println(result);

    }

    public int digitCount(int num) {
        return (int) (Math.log10(num) + 1);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Danielle
 */
public class SeparatingDigits {

    public void seperateDigit() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer of more than 2 digits or a negitive integer to exit: ");
        int num = sc.nextInt();

        while (num > 0) {

            if (num <= 99999 && num >= 1) {
                displayDigits(num);
            } else {
                System.out.print("Integer needs to be within 1-99999");
            }

            System.out.print("Enter an integer or a negitive integer to exit: ");
            num = sc.nextInt();
        }
    }

    public int quotient(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public void displayDigits(int num) {

        int divide = 1;
        int digit;
        var result = "";
        for (int i = 1; i < num; i *= 10)
            divide = 1;

        while (divide >= 1) {

            digit = quotient(num, divide);

            result = result + " " + digit;

            num = remainder(num, divide);
            divide = quotient(divide, 10);

        }

        System.out.println(result);

    }

}

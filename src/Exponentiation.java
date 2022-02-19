import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class Exponentiation {


    public void calculate() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();

        System.out.print("Enter exponent or a negative integer to quit: ");
        int exponent = input.nextInt();

        while (exponent >= 0) {
            System.out.printf("%d to the %d is %d\n", base, exponent, integerPower(base, exponent));

            System.out.print("Enter base: ");
            base = input.nextInt();

            System.out.print("Enter exponent or a negative integer to quit: ");
            exponent = input.nextInt();
        }
    }

    public int integerPower(int base, int exponent) {
        int total = 1;
        for (int counter = 1; counter <= exponent; counter++) {
            total *= base;
        }
        return total;
    }

}

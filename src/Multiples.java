/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Danielle
 */
public class Multiples {

    public void checkMultiples() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer or 0 to quit: ");
        int firstInt = sc.nextInt();

        while (firstInt != 0) {

            System.out.print("Enter second integer: ");
            int secondInt = sc.nextInt();

            if (multiple(firstInt, secondInt)) {
                System.out.printf("%d is a multiple of %d\n", firstInt, secondInt);
            } else {
                System.out.printf("%d is not a multiple of %d\n", firstInt, secondInt);
            }
            System.out.print("Enter first integer or 0 to quit: ");
            firstInt = sc.nextInt();
        }
    }

    public boolean multiple(int firstInt, int secondInt) {
        return secondInt % firstInt == 0;
    }
}

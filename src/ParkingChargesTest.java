/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author Danielle
 */
public class ParkingChargesTest {
    public static void main(String[] args) {
        double currentCost = 0;
        double totalCharges = 0;
        double hoursParked = 0;
        int vinNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of cars: ");
        int numCars = input.nextInt();

        for (int count = 1; count <= numCars; count++) {

            System.out.print("Enter vin number : ");
            vinNum = input.nextInt();
            System.out.print("Enter hours parked for car " + count + ": ");
            hoursParked = input.nextDouble();

            currentCost = ParkingCharges.calculateCharges(hoursParked); //most recent customer
            totalCharges += currentCost; //Running total}
            System.out.printf("Vin: %d Hours Parked: %.1f Charges: $%.2f\n", vinNum, hoursParked, currentCost);

        }
        System.out.printf("Running Total: $%.2f \n", totalCharges);
    }

}

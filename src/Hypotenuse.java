import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class Hypotenuse {

    public void calculateHypotenuse() {

        Scanner sc = new Scanner(System.in);

        double side1;
        double side2;

        System.out.print("Enter side 1 or a negative to exit: ");
        side1 = sc.nextDouble();

        while (side1 > 0) {

            System.out.print("Enter side 2: ");
            side2 = sc.nextDouble();

            System.out.printf("Hypotenuse is: %f\n", hypotenuse(side1, side2));

            System.out.print("Enter side 1 or negative to exit: ");
            side1 = sc.nextDouble();
        }
    }

    public double hypotenuse(double side1, double side2) {
        double hypotenuseSqrt = Math.pow(side1, 2) + Math.pow(side2, 2);

        return Math.sqrt(hypotenuseSqrt);


    }
}

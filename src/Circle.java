import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class Circle {

    public void calculateCircle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle you would like to draw or a negative to exit:");
        double radius = sc.nextDouble();

        while (radius > 0) {

            circleArea(radius);

            System.out.println();

            System.out.println("Enter the radius of the circle you would like to draw or a negative to exit: ");
            radius = sc.nextDouble();
        }


    }


    public void circleArea(double radius) {

        System.out.print(Math.PI * radius * radius);


    }

}

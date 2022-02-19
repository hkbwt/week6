import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class SquareOfAsterisks {

    public void drawSquareOfAsterisks() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side or square: ");
        int side = sc.nextInt();

        squareOfAsterisks(side);

    }

    public void squareOfAsterisks(int side) {

        for (int count = 1; count <= side * side; count++) {
            System.out.print("*");


            if (count % side == 0)
                System.out.println();
        }
    }
}

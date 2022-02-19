import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class Minimum {

    public void getMin() {

        Scanner sc = new Scanner(System.in);


        int flag = 0;
        while (flag != -1) {

            System.out.println("Enter an integer or -1 to quit: ");
            double one = sc.nextDouble();
            System.out.println("Enter an integer: ");
            double two = sc.nextDouble();
            System.out.println("Enter an integer: ");
            double three = sc.nextDouble();

            System.out.printf("Minimum is %f\n", getMinimum3(one, two, three));

            System.out.println("Enter 0 to continue or -1 to quit: ");
            flag = sc.nextInt();
        }
    }

    public double getMinimum3(double one, double two, double three) {
        return Math.min(Math.min(one, two), three);
    }

}

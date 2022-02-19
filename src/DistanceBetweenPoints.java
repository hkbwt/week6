import java.util.Scanner;

/**
 * @author Danielle
 */
public class DistanceBetweenPoints {

    public void calculateDistance() {

        Scanner sc = new Scanner(System.in);


        int flag = 0;
        while (flag != -1) {

            System.out.println("Enter one y -1 to quit: ");
            double oneX = sc.nextDouble();
            System.out.println("Enter an two y: ");
            double twoX = sc.nextDouble();
            System.out.println("Enter an one y: ");
            double oneY = sc.nextDouble();
            System.out.println("Enter an two y: ");
            double twoY = sc.nextDouble();

            double distance = getDistance(oneX, twoX, oneY, twoY);

            System.out.printf("Distance is: %f", distance);


            System.out.println("\nEnter 0 to continue or -1 to quit: ");
            flag = sc.nextInt();
        }


    }

    public double getDistance(double oneX, double twoX, double oneY, double twoY) {


        return Math.sqrt(Math.pow((oneX - twoX), 2) + Math.pow((oneY - twoY), 2));
    }
}

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class EvenOdd {
    public void checkOddEven() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (isEven(num)) {
                System.out.printf("%d is an even integer.\n", num);
            } else {
                System.out.printf("%d is not an even integer.\n", num);
            }
            System.out.print("Enter an integer or 0 to quit: ");
            num = sc.nextInt();
        }
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

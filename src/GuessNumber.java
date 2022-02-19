import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class GuessNumber {

    int answer;
    private final Random randomNumbers = new Random();

    public void startGame() {


        Scanner sc = new Scanner(System.in);

        int guessNum;

        newGame();

        System.out.print("Guess a number or enter 0 to exit: ");
        guessNum = sc.nextInt();

        while (guessNum != 0) {
            checkGuessNum(guessNum);

            System.out.print("Guess a number or enter 0 to exit");
            guessNum = sc.nextInt();

            if (guessNum == 0) {
                System.out.printf("You gave up :(, the answer is %d\n", answer);
            }

        }
    }

    public int getNumber() {

        return 1 + randomNumbers.nextInt(1000);

    }


    public void newGame() {
        answer = getNumber();
        System.out.println("Guess a number between 1 and 1000");

    }

    public void checkGuessNum(int guessNum) {

        if (guessNum < answer) {
            System.out.printf("%d is to low.\n", guessNum);
        } else if (guessNum > answer) {
            System.out.printf("%d is to high.\n", guessNum);
        } else {
            System.out.println("Congrats, you guessed it!!!!!\n");

            newGame();
        }


    }

}

import java.security.SecureRandom;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Danielle
 */
public class ComputerAssisted {
    SecureRandom random = new SecureRandom();
    int answer;
    int correct;
    int count;

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        int guess;

        getQuestion();

        System.out.println("Enter the answer to the problem or -1 to exit");
        guess = sc.nextInt();

        while (guess != -1) {

            checkAnswer(guess);

            System.out.println("Enter the answer or -1 to exit:");
            guess = sc.nextInt();


        }

    }

    public void getQuestion() {

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        answer = num1 * num2;
        System.out.printf("What is the product of %d and % d?\n", num1, num2);
    }

    public void checkAnswer(int guess) {

        if (guess != answer) {
            System.out.println(displayResponse(false));
        } else {
            System.out.println(displayResponse(true));
        }

    }

    public String displayResponse(boolean correct) {

        if (correct) {
            getQuestion();
            return ("Very Good!!!!!!!");

        } else {

            return ("No, please try again :(");
        }


    }
}

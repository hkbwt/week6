
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danielle
 */
public class GuessNum2 {
    
     private Random randomNumbers = new Random();
     int answer;
     int guesses = 0;
    
    public void startGame(){
        
        
        Scanner sc = new Scanner(System.in);
        
        int guessNum ;
        
        
        newGame();
        
        System.out.print("Guess a number or enter 0 to exit: ");
        guessNum = sc.nextInt();
        
        while (guessNum !=0){
            
            guesses ++;
            
            checkGuessNum(guessNum);
            
            System.out.print("Guess a number or enter 0 to exit");
            guessNum = sc.nextInt();
            
        
        }
    }
        
    public int getNumber(){
    
        return 1+ randomNumbers.nextInt(1000);
    
    }
    
    
    public void newGame(){
        answer = getNumber();
        System.out.println("Guess a number between 1 and 1000");
    
    }
    
    public void checkGuessNum(int guessNum){
        
        if (guessNum < answer){
            System.out.printf("%d is to low.\n", guessNum);
        }
        else if ( guessNum > answer){
            System.out.printf("%d is to high.\n", guessNum);
        }
        else{
            System.out.println("Congrats, you guessed it!!!!!\n");
            
            newGame();
        }
        
    }
    
    public void displayMessage(){
    
        System.out.printf("You guessed in %d tries\n", guesses);
        
        if (guesses < 10){
             System.out.println("Ither you know it or you got lucky");
        }
        else if(guesses == 10){
             System.out.println("Ahhh you know the secret");
        }
        else{
            System.out.println("DO BETTER");
        }
        
     }
    
    
    
    
    }
    



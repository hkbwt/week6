
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
public class CoinToss {
    
    private Random randomNumbers = new Random();
    
    public void startToss(){
        
        int heads = 0;
        int tails = 0;
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Toss the coin");
            System.out.println("2. Exit");
            System.out.println("3. Choice: ");
            choice = sc.nextInt();
            
            if (choice == 1){
                if (getFlip()){
                    heads++;
                }
                else{
                    tails++;
                }
                System.out.printf("Heads: %d Tails: %d\n", heads, tails);
            }
        }while (choice !=2);
    }
    
    
    public boolean getFlip(){
        
        return randomNumbers.nextInt(2) == 1;
    }
    
}

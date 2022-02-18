
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danielle
 */
public class ReverseDigit {
    
     public void getReverseDigit(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a integer you would like reversed: ");
        int num = sc.nextInt();
        
        System.out.println("Your integer reversed is: ");
        
       System.out.println(calculateReverseDigit(num));
        
     }
     
     
    public int calculateReverseDigit(int num){
        
        int reverseNum = 0;
        while( num != 0 ){
          reverseNum = reverseNum * 10;
          reverseNum = reverseNum + num%10;
          num = num/10;
        } 
        return reverseNum;
     }
    
}

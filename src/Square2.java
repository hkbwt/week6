
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danielle
 */
public class Square2 {
    
    public void drawSqareOfAsterisks(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side or square: ");
        int side = sc.nextInt();
        
        System.out.print("Enter the character you would like to fill the square: ");
        char fill = sc.next().charAt(0);
        
        squareOfAsterisksFill(side, fill);
        
    }
    
    public void squareOfAsterisksFill(int side, char fill){
        
        for(int count = 1; count <= side* side; count++){
            System.out.print(fill);
        
        
            if(count % side ==0)
                System.out.println();
        }
    }
}


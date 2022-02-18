
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danielle
 */
public class TempTest {
    
    public void convertTemp(){
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
        
            System.out.println("Enter 1 to convert to fahrenheit or 2 to convert to "
                    + "celsius or 3 to exit: ");
            choice = sc.nextInt();
            
            if ( choice != 3){
                System.out.print("Enter temperature: ");
                int oldTemp = sc.nextInt();
                
                switch(choice){
                    case 1:
                        System.out.printf("%d fahrenheit to celsius is %d\n", oldTemp, getFarenhiet(oldTemp));
                        break;
                    case 2:
                        System.out.printf("%d celsius to fahrenheit is %d \n", oldTemp, getCelsius(oldTemp));
                        break;
                
                }
            
            
            }
        
        } while (choice !=3);

    }
    
    public int getCelsius(int farTemp){
        return ( (int) (5.0 /9.0 * (farTemp - 32))); 
    }
    
    public int getFarenhiet(int celTemp){
        return ((int) (9.0 /5.0   * celTemp + 32)); 
    }
    
}

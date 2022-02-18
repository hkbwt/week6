
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danielle
 */
public class Minimun {
    
    public void getMin(){
       
        Scanner sc = new Scanner(System.in);
        
        
        
        
        int flag = 0;
        while ( flag != -1){
        
        System.out.println("Enter an interger or -1 to quit: ");   
        double one = sc.nextDouble();
        System.out.println("Enter an interger: ");
        double two = sc.nextDouble();
        System.out.println("Enter an interger: ");
        double three = sc.nextDouble();
        
        System.out.printf("Minimum is %f\n",getminmuim3(one, two, three));
        
        System.out.println("Enter 0 to continure or -1 to quit: ");
        flag = sc.nextInt();
        }
    }
    
    public double getminmuim3(double one, double two, double three){
        return Math.min(Math.min(one, two), three);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Danielle
 */
public class ParkingCharges {


    //Account constructor that receives two parameters
    public ParkingCharges() {


    }


    //method to calculate hours
    public static double calculateCharges(double hours) {
        double charges = 0.0;
        if (hours <= 3) {
            charges = 2;
        } else if (hours > 3 && hours <= 19) {
            charges = 2.0 + 0.5 * (hours - 3);
        } else if (hours > 19) {
            charges = 10.00;
        }

        return charges;


    }


}       
        
    
    

                   

          
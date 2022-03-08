package labguide3;

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gökan
 */
public class VacuumCleaner {
    
    String state;
    int speed;
    float temp;
    
    VacuumCleaner() {
        //int newSpeed, float newTemp
     /*   this.state = "Exploring";
        this.speed = newSpeed;
        this.temp = newTemp;*/
    }
    
    public void displayAttributes() {
    
        System.out.println("State: " + this.state);
        System.out.println("Speed: " + this.speed);
        System.out.println("Temperature: " + this.temp);
            
    }
    
    public void controlTemp() {
    
        if(this.temp < -80) {
            System.out.println("Checking the temperature.");
            this.state = "Turn to home";
            this.speed = 5;
            displayAttributes();
        } else {
            System.out.println("Changing the temperature to -90.0");
            this.temp = -90;
            displayAttributes();
        }
    
    }
    
        public static void main(String[] args) {
        // TODO code application logic here
        int speed;
        String state;
        float temp;
        
        Scanner inp = new Scanner(System.in);
        
        
        VacuumCleaner myVac = new VacuumCleaner();
        
        System.out.print("State: ");
        state = inp.nextLine();
        System.out.print("Speed: ");
        speed = inp.nextInt();
        System.out.print("Temperature: ");
        temp = inp.nextFloat();
        
        myVac.speed = speed;
        myVac.state = state;
        myVac.temp = temp;
        
        myVac.controlTemp();
        
        
      
    }
    
    
    
} //class ends

/*
NAME: Chase Aceves
DATE: 03 March 2016
PROJECT INFO: Project 1 - Simple Programming Exercises
DESCRIPTION: Calculate Tip 
*/
import java.util.*;

public class CalculateTip {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner ( System.in );
        
        System.out.println("What is the subtotal?");
        double subtotal = userInput.nextDouble();
        
        System.out.println("What percent you'd like to tip?");
        double tip = userInput.nextDouble();
        
        double total = subtotal * tip / 100;
        System.out.println("Your tip amount is = ");
        System.out.println(total);
        
        double grandtotal = subtotal + total;   
        System.out.println("Your grand total will be = ");
        System.out.println(grandtotal);
            }
    
}

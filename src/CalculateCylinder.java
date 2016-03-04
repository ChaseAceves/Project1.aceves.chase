/*
NAME: Chase Aceves
DATE: 03 March 2016
PROJECT INFO: Project 1 - Simple Programming Exercises
DESCRIPTION: Calculate Cylinder
*/

import java.util.*;

public class CalculateCylinder {
    public static void main(String[] args) {   
        Scanner userInput = new Scanner ( System.in );
    
        System.out.println("What is the radius?");
        double radius = userInput.nextDouble();
    
        System.out.println("What is the length?");
        double length = userInput.nextDouble();
       
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println(volume);
    }
}

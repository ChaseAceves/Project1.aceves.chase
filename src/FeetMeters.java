/*
NAME: Chase Aceves
DATE: 02/23/2016
PROJECT: Project 1
 */
import java.util.*;

public class FeetMeters {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner ( System.in );
        
        System.out.println("How many feet to convert?");
        double feet = userInput.nextDouble();
        double meters = feet * 0.305;
        System.out.println("Your feet in meter's are =");
        System.out.println(meters);
    }
    
}

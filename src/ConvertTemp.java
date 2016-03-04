/*
NAME: Chase Aceves
DATE: 03 March 2016
PROJECT INFO: Project 1 - Simple Programming Exercises
DECRIPTION: Convert temp
*/
import java.util.*;

public class ConvertTemp {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner ( System.in );
        
        System.out.println("Input the Celesius degress you'd like converted -");
        double celsius = userInput.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        System.out.println("Your degrees in Fahrenheit are =");
        System.out.println(fahrenheit);
        }
    
}

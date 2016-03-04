/*
NAME: Chase Aceves
DATE: 03 March 2016
PROJECT INFO: Project 1 - Simple Programming Exercises
DESCRIPTION: Calculate tip with GUI
 */

import javax.swing.JOptionPane;

public class CalculateTipGUI {


    public static void main(String[] args) {
        
        //Subtotal Amount
        String subInput = JOptionPane.showInputDialog(null, 
        "What it the subtotal?", "Tip Calculator", 
        JOptionPane.QUESTION_MESSAGE);
        double subtotal = Double.parseDouble(subInput);
        
        // Tip Percent
        String tipInput = JOptionPane.showInputDialog(null, 
        "What percent would you like to tip?", "Tip Calculator", 
        JOptionPane.QUESTION_MESSAGE);
        double tip = Double.parseDouble(tipInput);

        // Tip Amount & Grand Total
        double total = subtotal * tip / 100;
        double grandtotal = subtotal + total;
        JOptionPane.showMessageDialog(null,
        "Your tip amount is: '" + total + "'"
        + " & your grand total is: '" + grandtotal + "'.", 
        "Tip Calculator", JOptionPane.INFORMATION_MESSAGE);
// TODO code application logic here
    }
    
}

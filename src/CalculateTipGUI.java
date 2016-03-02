/*
NAME: Chase Aceves
DATE: 02/25/2016
PROJECT: Project 1
 */

import javax.swing.JOptionPane;

public class CalculateTipGUI {


    public static void main(String[] args) {
        
        //Subtotal Amount
        double subtotal;
        String subInput = JOptionPane.showInputDialog(null, 
        "What it the subtotal?", "Tip Calculator", 
        JOptionPane.QUESTION_MESSAGE);
        subtotal = Double.parseDouble(subInput);
        
        // Tip Percent
        double tip;
        String tipInput = JOptionPane.showInputDialog(null, 
        "What percent would you like to tip?", "Tip Calculator", 
        JOptionPane.QUESTION_MESSAGE);
        tip = Double.parseDouble(tipInput);

        // Tip Amount & Grand Total
        double total = subtotal * tip / 100;
        double grandtotal = subtotal + total;
        JOptionPane.showMessageDialog(null,
        "Your tip amount is: '" + total + "'"
        + " & Your grand total is: '" + grandtotal + "'.", 
        "Tip Calculator", JOptionPane.INFORMATION_MESSAGE);
// TODO code application logic here
    }
    
}

package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		
	String Money1 =	JOptionPane.showInputDialog("how many nickels do you have");

		// Convert their answer to an int using Integer.parseInt()
	int nickel = Integer.parseInt(Money1);

		// Ask the user how many dimes they have, and convert their answer
	
	String Money2 =	JOptionPane.showInputDialog("how many dimes do you have");
	int dimes = Integer.parseInt(Money2);


	// Ask the user how many quarters they have, and convert their answer
	String Money3 =	JOptionPane.showInputDialog("how many qaurter do you have");
	int quarter = Integer.parseInt(Money3);

		// Calculate how much money the user has and save it in a double variable 
int total = ((nickel * 5) + (dimes * 10)  + (quarter * 25)) / 100;

JOptionPane.showMessageDialog(null, "you have " + total + " dollors");
		// Tell the user how much money they have

	}
}


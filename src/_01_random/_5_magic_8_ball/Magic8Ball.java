//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below��.
public static void main(String[] args) {
	Random randomK = new Random();
	int rannum = randomK.nextInt(3);
	System.out.println(rannum);
	JOptionPane.showInputDialog("Question anything can answer with yes or no");
	if(rannum == 0) {
		JOptionPane.showConfirmDialog(null, "yes");
	}
	if(rannum == 1) {
		JOptionPane.showConfirmDialog(null, "no");
	}
	if(rannum == 2) {
		JOptionPane.showConfirmDialog(null, "sarch for google");
	}
	else {
		JOptionPane.showConfirmDialog(null, "I dont know");
	}
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}

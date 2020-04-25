//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		int d = 0;
		for(int i=0; i <10;i++) {
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if(randomNumber == 3) {
			JOptionPane.showConfirmDialog(null, "your the lucky guy!");
			d = d +1;
		}
		else {
			JOptionPane.showConfirmDialog(null, "try again!");
		}
		// 1. Use each value of randomNumber to give the user a random compliment.
		}
		// 2. Repeat all the code above 10 times	
		JOptionPane.showConfirmDialog(null, "your score is "+d);
		// 3. Find someone to test out your program. They will like it :)
	}
}

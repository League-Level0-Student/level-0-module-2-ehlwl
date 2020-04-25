package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_number {
	public static void main(String[] args) {
		Random rannum = new Random();
		for (int i = 0; i < 6; i++) {
			
			
			int num = rannum.nextInt(100);
			JOptionPane.showConfirmDialog(null, num);
			
		}
		
	}
}
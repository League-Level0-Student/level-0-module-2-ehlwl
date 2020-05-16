package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {
		String o = JOptionPane.showInputDialog("how old are you?");
		int old = Integer.parseInt(o);
		if (old >= 18) {
			JOptionPane.showInputDialog("who the next presedent sould be?");
		}
		else {
			JOptionPane.showConfirmDialog(null, "nobody cares about your think.");
		}
	}

}


package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown  or the rocket won launch.
 * 
 * The ground control chief will tell you where to start  then count down to 0. 
 * 
 * (example for 11: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
			String n = JOptionPane.showInputDialog("what number do you want to start?");
		// 3. Change the countdown to use the new starting point
			int s = Integer.parseInt(n);
		// 1. Print a countdown from 10 to 0 on the console
			for(int i = s; i >0; i--) {
				System.out.println(i);
				speak(i+"");
				
			}
			// 4. Use the speak method to hear the countdown.
		
			// 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
		
		// 5. when the counting is done, speak "blastoff!"
	}

static void speak(String words) {
   	 try {
   		// Runtime.getRuntime().exec("say " + words).waitFor();
   		 JOptionPane.showMessageDialog(null, words);
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}



//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._1_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		
		
		//3   Now to make num random. 
		Random rand = new Random();
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		int num = rand.nextInt(301);
		//3b. Next, set the value of num, using .nextInt() to get a random number from the Random object
		num = num - 222;

		//4. Now limit the value of num to be between 0 and 100

		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

		//6. Challenge: Limit the value of num to be between -222 and 88

		//1. Print out the value of num
		System.out.println(num);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}

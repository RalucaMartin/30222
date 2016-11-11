/**
 * Eduard Hantig - Assignment 1.3 + Twist.
 */
package palindrome;

public class LargestPalindrome {
	
/* My program tests, decrementing from the biggest possible number, if it is a palindrome. 
 * If and only if it finds a palindrome, then verifies if it can be wrote like a product of
 * two 3 or 4 digit numbers. I chose this variant to optimize the execution time. Thus, we obtain 
 * a minor steps of iterations (at least I think so :) ).
 * 
 * It is exemplified for 4 digit numbers.
 */
	public static void main(String[] args) {
		int number = 9999 * 9999; // number = 999 * 999; for the 3 digit numbers version.
		int palindrom = 0;
		int copy = 1;
		boolean ok = false;
		
		while (number > 0) {
			copy = number;
			palindrom = 0;
			while (copy != 0) {
				palindrom = palindrom * 10 + copy % 10;
				copy = copy / 10;
			}
			if(palindrom == number) {  // counter = 999 and > 99 for the 3 digit numbers version.
				for(int counter1 = 9999; counter1 > 999; counter1--) { 
					if (palindrom % counter1 == 0) {
						for(int counter2 = 9999; counter2 > 999; counter2--) {
							if (palindrom == counter1 * counter2) {
								System.out.println("The largest Palindrome obtained by multiplying two 4 digit numbers is " + palindrom);
								ok = true;
								break; 
							}
						}
					}
					if(ok) { break; }
				}	
			}
			number--;
			if(ok) { break; }
		}
	}
}
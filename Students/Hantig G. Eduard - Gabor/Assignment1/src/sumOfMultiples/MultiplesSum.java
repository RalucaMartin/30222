/**
 * Eduard Hantig - Assignment 1.1 + Twist 1 & 2.
 */

package sumOfMultiples;
import java.util.Scanner; // Scanner used for the 1st Twist

public class MultiplesSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for(int counter = input.nextInt() - 1; counter > 0; counter--) {
			if ((counter % 3 == 0) || (counter % 5 == 0)) {
				if(Integer.MAX_VALUE - sum > counter) {
					sum += counter;
				} else {
					System.out.println("Overflow");
					break;
				}
			}
		}
		System.out.println(sum);
		input.close();
		
//	For the 2nd Twist
		sum = 0;
		for(int counter = 0; counter < Integer.MAX_VALUE; counter++) {
			if ((counter % 3 == 0) || (counter % 5 == 0)) {
				if (Integer.MAX_VALUE - sum > counter) {
					sum += counter;
				} else {
					
					System.out.println("At the next multiple of 3 or 5, beginning with " + counter + " will occur an overflow.");
					break;
				}
			}
		}
	}
}
/* Regarding the long type:
 * We can use the same idea. We have only to modify
 * the sum and counter variables into long type and
 * put into the test condition the Long.MAX_VALUE.
 * */ 

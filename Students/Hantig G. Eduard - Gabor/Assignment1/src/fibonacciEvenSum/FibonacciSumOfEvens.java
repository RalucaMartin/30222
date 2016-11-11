/**
 * Eduard Hantig - Assignment 1.2 + Twist 1 & 2.
 */
package fibonacciEvenSum;

public class FibonacciSumOfEvens {

// For the 1st Twist
	public static void main(String[] args) {
		int nr1, nr2, next, sum;
		
		nr1 = 1; 
		nr2 = 2;
		sum = 2; 
		next = 3;
		while(next <= 4000000) {
			if(next % 2 == 0) {
				sum += next;
			}
			next = nr1 + nr2;
			nr1 = nr2;
			nr2 = next; 
		}
		System.out.println(sum);
	}
}

/* For the 2nd Twist I found the next formula: 
 * 
 * If n is even then k = n/2:
 * F(n) = [2*F(k-1) + F(k)]*F(k)
 * 
 * If n is odd then k = (n + 1)/2
 * F(n) = F(k)*F(k) + F(k-1)*F(k-1)
 * 
 * As we can see, this formula will find the
 * n’th Fibonacci Number in O(Log n) time.
 *
 * We can create a recursive method using the
 * recurrence formula above.
 * 
 * Maybe I will be able to code that soon, when
 * my java syntax knowledge will increase. 
 */
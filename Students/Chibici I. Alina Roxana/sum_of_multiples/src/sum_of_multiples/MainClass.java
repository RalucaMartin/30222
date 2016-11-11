package sum_of_multiples;
//class for reading a number from keyboard
import java.util.Scanner;

//the sum of the multiples of 3 and 5 under 1000
public class MainClass {

	public static void main(String[] args) {
		//create 2 numbers on which to apply the method of cumputing the sum of multiples
		MultipleOfX firstNumber = new MultipleOfX(3);
		MultipleOfX secondNumber = new MultipleOfX(5);
		//create the object keyboard on which we apply the method of reading from keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Multiples up to: ");
		long n = keyboard.nextLong();
		long sum = firstNumber.sumOfMultiples(n) + secondNumber.sumOfMultiples(n);
		System.out.println(sum);
		
	}

}
//the last number of type int which shows a correct result is 89739 - result: 2 147 418 374
// the maximum of int is 2 147 483 647 
//  the maximum of long is 9,223,372,036,854,775,807
// it takes way too much time to find out the last value that gives the right answer

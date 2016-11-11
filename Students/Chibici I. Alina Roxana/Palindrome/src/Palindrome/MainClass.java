package Palindrome;
import Palindrome.GetPalindrome;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers should the palindrome have? ");
		int digit = keyboard.nextInt();
		GetPalindrome n = new GetPalindrome(digit);
		int number;
		number = n.highestPalindrome();
		System.out.println(number);
	}
}

package Palindrome;

public class Palindrome {
	public static Boolean isPalindrome(int n) {
			 int copy,newNumber;
			 newNumber = 0;
			 copy = n;
			 while(n > 0){
				 newNumber = (newNumber * 10) + (n % 10);
				 n = n / 10;
			 }
			 if(newNumber == copy){
			 	return true;
			 }
			 else {
			 	return false;
			 }
		}
	}

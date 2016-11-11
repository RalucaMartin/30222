
public class Palindrome {
	public static void main(String[] args){
		int nrone = 999,nrtwo = 999, 	//nrone && nrtwo = 999 for 3 digit, 9999 for 4 digit
			digit = 100; 				//digit=100 for 3-digit, 1000 for 4 digit  
		maxPalindrome(nrone, nrtwo, digit);
	}
	
	public static boolean isPalindrome(int number){ 	//function to check if number is palindrome
		boolean isOrNot = false;
		int inverse = 0, newNumber = number;
		while (newNumber != 0){
			inverse = inverse * 10 + newNumber % 10;
			newNumber /= 10;
		}
		if(inverse == number){
			isOrNot = true;
		}
		return isOrNot;
	}
	
	public static void maxPalindrome(int nrone, int nrtwo, int digit){ //function to determine max palindrom of two 'digit'- digit number
		int maxpalindrome = 0;  
		for(int i = nrtwo; i >= digit; i--){
			for(int j = nrone; j >= digit; j--){	
				if(isPalindrome(i * j) == true && maxpalindrome < i * j){
					maxpalindrome = i * j;  
				}
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit number is: " + maxpalindrome);
	}
}

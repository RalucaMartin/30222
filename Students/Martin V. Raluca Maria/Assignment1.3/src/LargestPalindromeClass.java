
public class LargestPalindromeClass {
	
	 public static boolean isPalindrome(int number) {
		 int palindrome = number;
		 int reverse = 0;
		 while(palindrome > 0) {
			 int digit = palindrome % 10;
			 reverse = reverse * 10 + digit;
			 palindrome=palindrome / 10;
		 }
		 if(number==reverse) {
			 return true;
		 }
		 return false;
	 }
	 
	 public static void main(String[] args) {
		 
		 int maxim=0; 
		 int product=1;
		 for (int i=999; i>=100; i--) {
			 for(int j=999; j>=100; j--) {
				 product=i*j;
				 if( (product>maxim) && (isPalindrome(product))) {
					 maxim=product;
				 }
			 }
		 }
		 System.out.println(maxim);	 
	 }

}

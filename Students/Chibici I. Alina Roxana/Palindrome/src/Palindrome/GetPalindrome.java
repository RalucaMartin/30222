package Palindrome;
import Palindrome.Palindrome;

public class GetPalindrome {
	public int limit;
	//constructor
	public GetPalindrome(int n){
		limit = n;
	}
	
	public int highestPalindrome(){
		int i,j,product,maxi,limSup,limInf;
		maxi = 0;
		limSup = ((int) Math.pow(10, limit)) - 1;
		limInf = (int) Math.pow(10, limit - 1 );
		for(i = limSup; i > limInf; i--){
			for(j = limSup; j > limInf; j--){
				product = i * j;
				if (Palindrome.isPalindrome(product)){
					if(product > maxi){
						maxi = product;
					}
				}
			}
		}
		return maxi;
	}
}


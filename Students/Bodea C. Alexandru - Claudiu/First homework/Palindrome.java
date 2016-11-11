import java.util.*;
 
public class Palindrome {
	
	
	
	static boolean isPalindrome(int n){
		int r,sum=0,temp;    
		  
		  temp=n;    
		  while (n>0) {    
		   r = n%10;  //getting remainder  
		   sum = (sum*10)+r;    
		   n = n/10;    
		  }    
		  if(temp == sum)    
			  return true;
		  else
			return false;  
		  }

	public static void main(String[] args){
		  
		  
		int i,j,prod;
		int max = 0;
		for(i=999; i>100; i--)
			for(j = 999; j > 100; j--){
				prod = i*j;
				if(isPalindrome(prod) && prod>max){
					max = prod;
				}
			}
		System.out.println( +max );
	}
	
  }

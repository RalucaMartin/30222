public class Palindrome {
	public static void main(String[] args){
		int i,j,prod;
		int max=0;
		for(i=999; i>100; i--)
			for(j=999; j>100; j--){
				prod=i*j;
				if(isPalindrome(prod) && prod>max){
					max=prod;
				}
			}
		System.out.println(+max);
	}
	static boolean isPalindrome(int x){
		int invers=0;
		int copie;
		copie=x;
		while (x!=0){
			invers=invers*10+x%10;
			x/=10;
		}
		if(copie== invers ){
			return true;
		}
			return false;
		
	}


}

public class LongestPalindrome {
	public static void main(String[] args){
		int i,j,prod,a=0,b=0;
		int max=0;
		for(i=9999; i>1000; i--)
			for(j=9999; j>1000; j--){
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


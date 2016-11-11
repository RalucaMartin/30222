
public class Fibonacci {

	public static void main(String[] args) {
			
		long[] fib=new long[35];
		
		fib[0]=1;
		fib[1]=1;
		
		int i=1;
		long s=0;
	
		
		while(fib[i]<4000000)
		{
			i=i+1;
			fib[i]=fib[i-1]+fib[i-2];
			if (fib[i]%2==0)
				s=s+fib[i];
		}
		
		
		System.out.println("Suma numerelor pare mai mici ca 4mil din sirul lui Fibonacci este: "+s);
		
		

	}

}

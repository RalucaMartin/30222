package palindrom;


import java.util.*;

public class pali {
	
	//functie determinare daca nr e palindrom
	
	public static int pal(int nr)
	{
	int ok=0;
	int n = nr;
    //inversare
	
    int a=0,b=0; 
    
    while(n > 0) 
    { 
      a = n % 10; 
      b= b * 10 + a; 
      n = n / 10; 
    }
    if (b==nr) ok=1;
    		
    return ok;
	}

	//determinarea celor doua numere
	public static int gasit(int nr, int n)
	{
		int max= (int) Math.pow(10, n);
		int min= (int) Math.pow(10,n-1);
		
		for(int i=max;i>=min;i--)
		{
			if ((nr%i==0) && (nr/i<max) && (nr/i>min))
				return i;
		}
		return -1;
	}
	
// determinarea celui mai mare nr palindrom care corespunde cerintelor	
	public static void nr(int n)
	{
		int max=(int) Math.pow(10, 2*n);
		
		int ok=0,k;
		
		while(ok==0)
		{
			max=max-1;
			if ((pal(max)==1) && ( gasit(max,n)>0) )
					 ok=1;
		}
		k=gasit(max,n);
		System.out.println("Cele doua numere care compun numarul "+max+" sunt: "+k+" si "+(max/k));
		
			
	
		
	}

	public static void main(String[] args) {
		int n;
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digits number?");
		n=input.nextInt();
		
		nr(n);
		

	}

}

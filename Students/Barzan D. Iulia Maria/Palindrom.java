package pb3;

public class Palindrom 
{
	public static boolean palindrom (long n)
	{
		long aux=n, uc=aux%10, ninv=0;
		
		while (n!=0)
		{
			ninv=ninv*10+uc;
			uc=aux%10;
			aux=aux/10;
		}
		
		if (n==ninv)
			{
				return true;
			}
		else 
			{
				return false;
			}
	}

	
	public static void main (String[] args)
	{
		long max=0;
		
		for (long i=100; i<=999; i++)
			for (long j=100; j<=999; j++)
			{
				long produs=i*j;
				if (palindrom(produs)==true || produs>max)
					{
						max=produs;
					}
			}
		
		System.out.println(max);
	}
}

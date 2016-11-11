package pb2;
import java.util.Scanner;

public class Fibo 
{
	public static int suma_fib(int n)
	{
		int anteprec=1, prec=1, fib=0, sum=2;
		
		if (n==1)
			{
				return 1; //Daca se cere a
			}
		else 
			if (n==2)
			{
				return 2;
			}
		else
		{
			for (int i=3; i<=n; i++)
			{
				fib=anteprec+prec;
				anteprec=prec;
				prec=fib;
				sum=sum+fib;
			}
			return sum;
		}
	}
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in); 
		System.out.println ("Dati numarul");
		int n=in.nextInt();
		
		System.out.println (suma_fib(n)) ;
	}

}

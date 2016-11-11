package pb1;

public class Suma 
	{
		public static int suma3 (int n)
		{
			int suma=0;
			for (int i=1; i<=n; i++)
				{
					if (i%3==0)
						{
							suma=suma+i;
						}
				}
			return suma;
		}
		
		public static int suma5 (int n)
		{
			int suma=0;
			for (int i=1; i<=n; i++)
				{
					if (i%5==0)
						{
							suma=suma+i;
						}
				}
			return suma;
		}
		
		
		public static void main(String [] args)
			{
				int suma_finala;
				suma_finala=suma3(1000)+suma5(1000);
				System.out.println(suma_finala);
			}	
		
	}



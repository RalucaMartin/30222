
package multipli;

import java.util.*;
public class multipli {

	public static int suma(int x, int n)
	{  int s=0,i;
		for( i=1;i<=n				;i++)
			{
				s=s+x*i;
				
			}
		return s;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,j,n,s1,s2,s;
		//citirea valorilor
		i= input.nextInt();
		j=input.nextInt();
		n=input.nextInt();

		
		//calcularea sumei multipliilor fiecarui numar
		s1=suma(i,(n-1)/i);
		s2=suma(j,(n-1)/j);
		s=s1+s2;
		
		
		//afisare
		System.out.println("Suma multiplilor de "+i+" si "+j+" pana la numarul "+n+" este: "+s);
		
		
		//Problema merge pana la n=2,147,483,647

	}

}

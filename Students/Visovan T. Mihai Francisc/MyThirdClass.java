
public class MyThirdClass {
	public static void main(String args[]){
		
		int n = 9999, ok, palindrom, saved, m, number;
		int[] v = new int[8];
		for(int i = n; i >= 1000; i--)
		{	palindrom  = n * i;
		
		saved = palindrom;
		number = 7;
		ok = 1;
		while(palindrom != 0)
			{
			v[number] = palindrom % 10;
			palindrom /= 10;
			number--;
			}
		
		m = 7;
		for(number = 0; number <= m; number++)
			if(v[number] != v[m - number])
				ok = 0;
		
		if(ok == 1)
			{
			System.out.println("Cel mai mare palindrom este:");
			System.out.println(saved);
			Runtime.getRuntime().exit(n);
			}
		}
		
		System.out.println("Nu exista palindrom format din produsul a 4 cifre");
	}
}


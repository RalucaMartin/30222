import java.util.*;

public class Sum {
	public static void main (String[] args) {
		
		SumMultiples();
	}


	public static void SumMultiples() {
		
		Integer nr;
		Scanner in = new Scanner(System.in);
		System.out.println("Read number nr: ");
		nr = in.nextInt();
		
		int s = 0, i;
		for(i = 1; i <= nr; i++)
			 if(i % 3 == 0 || i % 5 == 0)
			     { 
				  s += i;
			     }
	   
		System.out.println("The sum of multiples of 3 and 5 is " + s);
	}
}

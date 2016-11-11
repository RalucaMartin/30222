
import java.util.Scanner;
public class Fibonacci_met1 {
	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
	}
	
        static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i,n;
		System.out.print("valori pt n= ");
		n=sc.nextInt();
		 for ( i = 1; i <= n; i++)
			 System.out.println(fibonacci(i));
	
	}
}


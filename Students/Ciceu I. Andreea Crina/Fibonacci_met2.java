import java.util.Scanner;
public class Fibonacci_met2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i,n,a,b,c;
		a = 1; b = 1; c = 0;
		System.out.print("citeste n ");
		n = sc.nextInt();
		if (n <= 2)
			System.out.println("1");
		else {
			for(i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;	
				System.out.println(b);
			}
		}
	}
}

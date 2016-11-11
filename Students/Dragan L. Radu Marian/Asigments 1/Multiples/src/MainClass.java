import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int i;
		int n;
		Scanner input = new Scanner(System.in);
		int sum=0;
		for(i=0;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.println("Suma este " + sum);
		System.out.println("Introduceti numarul: ");
		n = input.nextInt();
		sum= Multiples.suma(n);
		System.out.println("Suma este " + sum);
	}
}

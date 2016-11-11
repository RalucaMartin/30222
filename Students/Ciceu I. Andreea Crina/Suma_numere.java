import java.util.Scanner;
public class Suma_numere {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i,n,s;
		s = 0;
		System.out.print("valori pt n= ");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			if( (i % 3 == 0) || (i % 5 == 0) )
				s = s + i;
		}
		System.out.println("suma este:  "+ s);	
	}

}

package multiple;
import java.util.*;
public class Multiple {
	public static Scanner in;

	public static void main (String[] args) {
		int total = 0;
		int i;
		
		int n;
		in = new Scanner(System.in);
		System.out.print("Dati o valoare: ");
		n=in.nextInt();
		for( i = 0; i<n; i++){
			if( i%3 == 0 || i%5 == 0){
				total += i;
			}
		}
			
		System.out.println("Suma tuturor multiplilor de 3 si 5: " +total);	
	}
}

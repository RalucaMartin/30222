import java.util.*;
public class Multiple {
	public static void main (String[] args) {
		int total=0;
		int i;
		
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("Dati o valoare: ");
		n=in.nextInt();
		for(i=0; i<n; i++){
			if(i%3==0 || i%5==0){
				total+=i;
			}
		}
			
		System.out.println("The sum of all the multiples of 3 or 5 is: " +total);	
	}
}

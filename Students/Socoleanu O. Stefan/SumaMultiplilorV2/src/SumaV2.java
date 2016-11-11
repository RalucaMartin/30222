import java.util.Scanner;

public class SumaV2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner user = new Scanner(System.in);
		int numar = user.nextInt();
		for (int i=1 ; i*3<numar || i*5<numar ; i++ ) {
			if(i*3<numar) {
				sum+=i*3;
			}
			if(i*5<numar){
				if((i*5)/3!=0) {
					sum+=i*5;
				}
			}
			
		}
		System.out.println("Suma este "+sum);

	}

}

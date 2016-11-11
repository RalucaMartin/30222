import java.util.Scanner;
public class MultipleClass {
	public static void main(String[] args) {
		int total=0;
		for(int i=0; i<1000; i++)
			if( (i%3==0) || (i%5==0) ) total=total+i;
		System.out.println(total);
		
		//twist1
		int number;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your number: ");
		number= in.nextInt();
		int total_2=0;
		for(int i=0; i<number; i++)
			if( (i%3==0) || (i%5==0) ) total_2=total_2+i;
		System.out.println(total_2);
		
		//twist1
		//2147483647 //for integer
		//9223372036854775807 //for long
	}
}

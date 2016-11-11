import java.util.Scanner;
public class MyClass {

	public static void main(String args[]){
		//System.out.println("Hello world!");
		Scanner in = new Scanner(System.in);
		
		int i, sum = 0;
		System.out.printf("Enter i Value: ");
	    int number = in.nextInt();
	    
		for(i = 1; i < number; i++)
			if(i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		
			System.out.println("Sum is ");
			System.out.println(sum);
	}
	
}

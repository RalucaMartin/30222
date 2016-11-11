import java.util.Scanner;

public class Sum {
	
	private static Scanner Inputnumber;
	public Sum(){	
	}
	public int calculate(int a){
		int b = 0;
		int i;
		for(i = 1; i < a+1; i++){
			if ((i % 3) == 0){
				b = b + i;
			}
			else if ((i % 5) == 0){
				b = b + 5;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		int Number;
		Inputnumber = new Scanner(System.in);
		System.out.printf("Introduce a number: ");
		Number=Inputnumber.nextInt();
		System.out.printf("The sum of all the multiples of 3 and 5 below "+Number+" is: "+sum.calculate(Number));
		
	}

}

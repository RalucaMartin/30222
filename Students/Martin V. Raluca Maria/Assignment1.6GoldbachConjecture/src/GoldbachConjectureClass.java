
public class GoldbachConjectureClass {
	
	public static boolean isPrime(int number) {
		for(int i=2; i<number/2; i++) {
			if(number % i==0) {
				return false;
			}
		}
		return true;
	}
	public static void goldbach(int number) {
		//is the number even?
		if( number % 2 != 0) {
			System.out.println("The number isn`t even");		
		}
		if( number <= 2 ) {
			System.out.println("The number is less than 2");
		}
		for( int i=3; i<number/2; i++){
			if( (isPrime(i)) && isPrime(number-i)) {
				System.out.println("prime numbers: " + i + " " + (number-i));
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		goldbach(50);
	}
}

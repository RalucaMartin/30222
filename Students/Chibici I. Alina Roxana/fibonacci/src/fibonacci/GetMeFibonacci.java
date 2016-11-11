package fibonacci;
import fibonacci.Even;

public class GetMeFibonacci {
	public int fOne, fTwo;
	//constructor
	public GetMeFibonacci(int nOne, int nTwo){
		fOne = nOne;
		fTwo = nTwo;
	}
	//method //values under 4 milion - sum of even numbers
	public int fib(){
		int sum = 0;
		if(Even.isEven(fOne)) {
			sum = sum + fOne;
		}
		if(Even.isEven(fTwo)) {
			sum = sum + fTwo;
		}
		int fibNext;
		fibNext = 1;
		do{
			fibNext = fOne + fTwo; 
			fOne = fTwo;
			fTwo = fibNext;
			if(Even.isEven(fibNext)){
				sum = sum + fibNext;
			}
		} while (fibNext < 4000000);
		return sum;
	}
}

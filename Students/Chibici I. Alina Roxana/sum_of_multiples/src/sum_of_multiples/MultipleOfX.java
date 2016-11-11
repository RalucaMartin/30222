package sum_of_multiples;

public class MultipleOfX {
	public long value;
	//constructor
	public MultipleOfX(long number){
		value = number;
	}
	//method
	public long sumOfMultiples(long n){
		long i;
		long sum;
		sum = 0;
		for(i = 1; i < n; i++){
			if(i % value == 0){
				sum = sum + i;
			}
		}
		return sum;
	}
}

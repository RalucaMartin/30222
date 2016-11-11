package fibonacci;

public class MainClass {
	public static void main(String[] args) {
		GetMeFibonacci fi = new GetMeFibonacci(1,2);
		int sum;
		sum = fi.fib();
		System.out.println(sum);
	}
}

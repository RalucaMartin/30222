
public class Fibonacci {

	public static void main(String[] args) {
		int a=1, b=1;
		int sum=0, c=0;
		while(c<=4000000) {
			c=a+b;
			b=a;
			a=c;
			if(c%2==0) {
				sum=sum+c;
			}
		}
		System.out.println(sum);

	}

}

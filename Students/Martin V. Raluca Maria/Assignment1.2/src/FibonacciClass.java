
public class FibonacciClass {		
	public static void main(String[] args) {
		int prev=1, curr=2;
		int total = 2;
		int sum;
		while((prev+curr)<4000000) {
			sum=prev+curr;
			prev=curr;
			curr=sum;			
			if(sum%2==0) total=total+sum;
		}
		System.out.println(total);
	}
}


public class Multiples {
	public static int suma( int n) {
		int sum=0;
		int i;
		for(i=0;i<n;i++) {
			if(i%3==0 || i% 5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}


public class SirulFibo {

	public static void main(String[] args) {
		int a=1,b=1,sum=0;
		while(b <= 4000000) {
			if(b % 2 == 0){
				sum+=b;
			}
			b=a+b;
			a=b;
		}
		System.out.println("Suma termenilor pari este "+sum);

	}

}

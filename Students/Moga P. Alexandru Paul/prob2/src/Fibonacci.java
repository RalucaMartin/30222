
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=0;
		int s=0;
		int x=0;
		while(c<4000000)
		{
			c=a+b;
			a=b;
			b=c;
			if(c>=4000000)
				break;
			if(c%2==0)
				s=s+c;
			System.out.println(s);
		}

	}

}

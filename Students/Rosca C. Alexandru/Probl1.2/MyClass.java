import java.util.*;

public class MyClass {
	public static void main(String[] args){
		int sum=2, a=1,b=2,c,i;
		
		Scanner input=new Scanner(System.in);
		System.out.println("nr= ");
		int nr=input.nextInt();
		
		for(i=2; i<nr;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				sum=sum+c;
		}
			
		
		System.out.println("Sum is: "+ sum);
		
	}
}

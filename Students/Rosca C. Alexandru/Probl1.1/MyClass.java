
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("nr= ");
		int nr=in.nextInt();
		
		for(i=1;i<nr;i++){
			if(i%3==0||i%5==0)
				sum=sum+i;
		}
		System.out.println("Sum is: "+sum);
	}

}
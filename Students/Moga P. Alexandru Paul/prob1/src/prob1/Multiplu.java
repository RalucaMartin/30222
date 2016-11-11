package prob1;
import java.util.*;

public class Multiplu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("introduceti numarul:");
		Scanner in = new Scanner ( System.in );
		int a= in.nextInt();
		int i;
		int s=0;
		for(i=3;i<=a;i++)
		{
			if(i%3==0 || i%5==0)
			    s=s+i;
			
				
		}
       System.out.print(s);

	}

}

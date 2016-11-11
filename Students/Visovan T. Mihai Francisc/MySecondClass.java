
public class MySecondClass {
	public static void main(String args[]){
		
		int[] v = new int[12];
		int i, sum = 0;
		
		v[0] = 1;
		v[1] = 2;
		
		for(i = 2; i <= 12; i++)
			{
			v[i] = v[i-1] + v[i-2];
			if(v[i] % 2 == 0)	
				sum = sum + v[i];
			}
		
		System.out.println("The sum is");
		System.out.println(sum);
	}
	
}

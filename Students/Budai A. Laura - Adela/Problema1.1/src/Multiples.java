
public class Multiples {
	public static void main (String[] args) {
		int total=0;
		int i;
		for(i=0; i<1000; i++){
			if(i%3==0 || i%5==0){
				total+=i;
			}
		}
			
		System.out.println("The sum of all the multiples of 3 or 5 is: " +total);	
	}
}

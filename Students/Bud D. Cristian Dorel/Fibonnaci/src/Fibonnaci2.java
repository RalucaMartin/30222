

public class Fibonnaci2 {

	public static void main(String[] args){
		double n = 0;
		double an = 1;
		double sum = 0;
		
		while (an < 4000000){
			an = (Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)) / Math.sqrt(5);
			
			if(an % 2 == 0){
				sum = sum + an;
			}
			
		}
		
		System.out.println(sum);
	}
}

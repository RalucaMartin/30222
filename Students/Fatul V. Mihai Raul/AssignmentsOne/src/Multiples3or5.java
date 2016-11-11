
public class Multiples3or5 {

	public static void main(String[] args) {
		Below1000();

	}
	public static void Below1000(){
		int sum = 0;	
			
			for(int i = 1; i <= 1000; i++){
				if(i % 3 == 1 || i % 5 == 1){
					sum += i;
				}
			}
		System.out.println("Sum of multiples of 3 or 5 is: "+sum);
	}
}

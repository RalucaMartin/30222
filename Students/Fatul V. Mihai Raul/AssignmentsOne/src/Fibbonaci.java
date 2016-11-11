
public class Fibbonaci {

	public static void main(String[] args) {
		int sum=0;
		sum = fibbonaci();
		System.out.println("Even sum is: " + sum);
	}
	
	 public static int fibbonaci(){
		int sum = 0, f1 = 1, f2 = 2, f3;
		
		do{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			sum += f1;
		}while(f3 < 4000000);
		
		return sum;
	}
}

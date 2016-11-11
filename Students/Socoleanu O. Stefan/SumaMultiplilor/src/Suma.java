
public class Suma {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1 ; i*3<1000 || i*5<1000 ; i++ ) {
			if(i*3<1000) {
				sum+=i*3;
			}
			if(i*5<1000){
				if((i*5)/3!=0) {
					sum+=i*5;
				}
			}
			
		}
		System.out.println("Suma este "+sum);

	}

}

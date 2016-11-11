
public class Fibonnaci {
	
	public static void main(String[] args){
		int a = 1, b = 2, sum = 2, aux;
		while (b < 4000000){
			aux = a;
			a = b;
			b = a + aux;
			if(b % 2 == 0 && b < 4000000)
				sum = sum + b;
		}
		System.out.println(sum);
	}

}

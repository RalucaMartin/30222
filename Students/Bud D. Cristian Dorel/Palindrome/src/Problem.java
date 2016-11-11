
public class Problem {
	
	public static void main(String [] args){
		int i, j, product, aux, maximum = 0;
		for(i = 100; i < 1000; i++){
			for(j = 100; j < 1000; j++){
				product = i * j;
				aux = 0;
				while(product != 0){
					aux = aux * 10 + product % 10;
					product = product / 10;
				}
				
				if(aux == i * j && maximum < aux)
					maximum = aux;
					
			}
		}
		System.out.println(maximum);
	}
}

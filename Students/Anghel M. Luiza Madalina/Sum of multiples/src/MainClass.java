
public class MainClass {
	
	public static void main(String[] args ){
		System.out.println("Suma multiplilor este: ");
		int suma = 0;
		for(int i = 0; i<1000; i++){
			if((i%3)==0){
				suma = suma + i;
			}
			else if((i%5)==0){
				suma = suma + i;
			}
			
		}
		System.out.println(suma);
	}

}

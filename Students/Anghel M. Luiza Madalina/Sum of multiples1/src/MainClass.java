import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args ){
		int number;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Introdu un numar de la tastatura: ");
		number = in.nextInt();
		
		
		System.out.println("Suma multiplilor este: ");
		int suma = 0;
		
		for(int i = 0; i < number; i++){
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

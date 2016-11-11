import java.util.*;


public class MyClass {

	public static void main(String[] args) {
		
		int lenght=1, nrTotal=1, nrPrime=0, number=1, nrDiagonala=1;
		float raport=1;
		
		while(raport > 0.6){
				lenght+= 2;
				nrDiagonala = 1;
			while(nrDiagonala <= 4){
				
			number=number+ lenght- 1;
			nrTotal++;
			
			if(checkPrime(number)){
				nrPrime++;
			}
			nrDiagonala++;
			}
			raport=nrPrime / (float)nrTotal;
			
		}
		
		System.out.println("Max lenght is: "+ lenght);
		
	}

	static boolean checkPrime(int nr){
		
		boolean check=true;
		
		for(int i=2; i<=nr/2; i++){
			if(nr%i==0)
				check=false;
		}
		
		if(check!= false){
			return true;
		}
		return false;
	}
}

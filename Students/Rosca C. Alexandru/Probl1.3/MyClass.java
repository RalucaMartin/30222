import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		for(int i=999*999; i>=100*100; i--)
			if(palindrom(i)){
				if(verifica(i))
					break;
			}
		
	}



static boolean palindrom(int nr){
	int copie=nr, invers=0;
	
	while(nr!=0){
		invers=invers*10+nr%10;
		nr=nr/10;
	}
	
	if(copie==invers)
		return true;
	else
		return false;
			
	}

static boolean verifica(int nr){
	for(int i=999; i>=100; i--){
		
		if(nr%i==0){       //verific daca numarul se imparte exact la i
			int numar=nr/i, count=0 ; // verific daca rezultatul impartirii are 3 cifre
			int copie=numar;
			while(numar!=0){
				numar=numar/10;
				count++;
			}
			if(count==3){
				System.out.println("numar:  "+nr+" = "+i+" x "+nr/i);
				return true;
			}
		}
	}
	return false;
}

}
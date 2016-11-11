
public class MainClass {
	public static void main(String[] args) {
		int i, j, max=9, a=1000;
		for(i=9999;i>=a;i--) {
			for(j=9999;j>=1000;j--) {
				System.out.println("Acum se verifica: " + i + "*" + j +"= " + i*j);
				if(Pali.functie(i*j)) {
					if(i*j>max) {
						max=i*j;
						a=j;// Daca 999 * 801 ne da un palindrom, atunci i nu are de ce sa mai coboare sub 801.
					}
				}
			}
		}
		System.out.println("Cel mai mare palindrom e: " + max);
	}
}

// for 3 digit numbers is 906609
// for 4 digit numbers is 99000099
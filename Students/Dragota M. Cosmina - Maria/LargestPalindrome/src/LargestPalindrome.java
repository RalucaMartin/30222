public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, prod, aux, inv, uc, largest = 0;
		for (i = 100; i < 999; i++) {
			for (j = 100; j < 999; j++) {
				prod = i * j;
				aux = prod;// retin produsul
				inv = 0;
				while (aux != 0) {
					uc = aux % 10;
					aux = aux / 10;
					inv = inv * 10 + uc;
				}
				if (inv == prod) {
					System.out.println("Numarul " + prod + " este palindrom!");
					largest = inv;
				}
			}

		}
		System.out.println("Numarul "+ largest + " este cel mai mare palindrom obtinut din produsul a nr de 3 cifre!");
	}

}

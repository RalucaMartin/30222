
public class Pali {
	public static boolean functie(int n){
		int nr=0, c=0, auxn=n;
		if(n/10==0) {
			return true;
		}
		while(auxn>0) {
			c=auxn%10;
			nr=nr*10+c;
			auxn=auxn/10;
		}
		if(nr==n) {
			return true;
		}
		return false;
	}
}


public class CelMaiMarePalindrom {

	public static void main(String[] args) {
		int max=0;
		for(int i=999;i>99;i--) {
			for(int j=i;j>99;j--) {
				if(Palindrom(i*j)) {
					if(i*j>max)
						max=i*j;
				}
			}
		}
		System.out.println("Cel mai mare plaindrom este: "+max);
	}
	public static boolean Palindrom(int a) {
		int ogl=0,b=a;
		while(a>0) {
			ogl=ogl*10+a%10;
			a=a/10;
		}
		if(ogl==b) {
			return true;
		}
		return false;
	}

}


public class NumereClass {
	
	private  static int calcMaxim(int nr1 ,  int nr2 )
	{
		if(nr1>nr2) return nr1;
		else return nr2;
	}
	
	private static void prim(int numar)
	{
		int divizori=0;
		int i;
		for( i=1;i<=numar;i++){
			if(numar%i==0) divizori++;
			if(divizori==3) break;
		}
		if(divizori==2) System.out.println("este numar prim");
		else System.out.println("nu este numar prim");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HEllo world!");
		System.out.println(calcMaxim(1,2));
		prim(4);
		prim(3);
		prim(100);
		prim(2);
		
	

	}

}

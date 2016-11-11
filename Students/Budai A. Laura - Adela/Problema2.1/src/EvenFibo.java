public class EvenFibo {
	public static void main (String[] args){
		int nr1=1,nr2=1,f,sum=0,i;
		for(i=0; i<4000; i++){
			f=nr1+nr2;
			if(f%2==0){
				sum=sum+f;
			}
			nr1=nr2;
			nr2=f;
		}
		System.out.println(+sum);
	}

}

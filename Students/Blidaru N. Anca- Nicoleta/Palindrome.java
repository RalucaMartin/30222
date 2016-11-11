
public class Palindrome {
    
	public static void main(String[] args) {
		 
	     FindNumbers();
	}
	
	public static int Palindr(int n) {
		int nr = 0, nn = n;
		
		while(n > 0)
		 {
			nr *= 10;
			nr += n%10;
		    n /= 10;
		 }
		
		if(nr == nn)
		    return nr;
		
		return 0;
	}
	
	public static void FindNumbers() {
		
		int i, j, palinmax = 0, imax = 0, jmax = 0;
	    for(i = 999; i >= 100; i--)    // for 4-digit numbers we start the fors from 9999 to 1000 
	    	for(j = 999; j >= 100; j--)
	    		 if( Palindr(i * j) != 0 && Palindr(i * j) >= palinmax)
	    		      {
	    			   palinmax = i * j;
	    			   imax = i;
	    			   jmax = j;
	    			   break;
	    			  }
	    
	    System.out.println(imax);
	    System.out.println(jmax);
	    System.out.println("Maximum palindrome consisting of the product of 3-digit numbers is " + palinmax);
		
	}
}

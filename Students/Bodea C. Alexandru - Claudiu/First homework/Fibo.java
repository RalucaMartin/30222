
public class Fibo { 
	public static void main(String args[])  
		{    
		 int n1 = 0,n2 = 1,n3,i,count = 10,sum = 0;      
		    
		 for(i = 2;i < count; ++i)    
		 {    
		  	n3 = n1 + n2;     
		  if (n3%2 == 0){
			  sum = sum+n3;
		  }
		n1 = n2;    
		n2 = n3;    
		 } 
		System.out.print(" " +sum);
		  
		}
}  


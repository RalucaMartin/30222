package largestPalindrome;
import java.lang.String;

public class MainClass {
	public static void main(String[] args) {
				int number1, number2, maxim = 1, product;
				for (number1=100; number1<=999; number1++)
				{
					for (number2 = 101; number2<999; number2++)
					{
						product= number1 * number2;
						if (checkPalindrome(product)== true) 
						{
							if (product > maxim)
								maxim = product;
							
						}
						
					}
				}
				System.out.println("The largest palindrome is : "+ maxim);

			}
			
			public static boolean checkPalindrome(int number)
			{
				String numToCheck= Integer.toString(number);
				String reverse="";
				for (int i=numToCheck.length()-1; i>=0; i--)
				{
					char letter= numToCheck.charAt(i);
					reverse= reverse+ letter;
					
				}
				if (reverse.compareTo(numToCheck)== 0)
					return true;
				else return false;
				
			}

		}


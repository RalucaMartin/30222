package fibonacci;

public class MainClass {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		int suma = 1;
		int currentNumber;
		do
		{
			currentNumber = number1 + number2;
			number1 = number2;
			number2 = currentNumber;
			if (currentNumber %2 ==0) 
				suma += currentNumber;
			
		} while (currentNumber < 4000000);
		System.out.println(suma);
	}
}

import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOddsClass {
	public static void main(String[] args) {
		System.out.println("How many numbers do you need to draw? ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		
		System.out.println("How many numbers can you draw(the maximum is..): ");
		int n = in.nextInt();
		
		BigInteger lotteryOdds= BigInteger.valueOf(1);
		
		for (int i=1; i<=k; i++)
			lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

	    System.out.println("Your odds are 1 in " + lotteryOdds);
	}
}

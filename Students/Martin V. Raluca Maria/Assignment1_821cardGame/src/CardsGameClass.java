import java.util.Scanner;
public class CardsGameClass {
	public static void main(String[] args) {
		
		int player1 = 0, player2 = 0, sum1=0, sum2=0;
		player1 = (int) (Math.random() * 11);
		if (player1==0) {
			player1 = (int) (Math.random() * 11);
		}
		sum1 = sum1 + player1;
		
		
		player2 = (int) (Math.random() * 11);
		if (player2==0) {
			player2 = (int) (Math.random() * 11);
		}
		sum2 = sum2 + player2;
		
		System.out.println("The first card`s value for player1 is " + player1 + " do you want to continue, press 1-YES, 0-No");
		Scanner in= new Scanner(System.in);
		int answer1= in.nextInt();
		
		System.out.println("The first card`s value for player2 is " + player2 + " do you want to continue, press 1-YES, 0-No");
		Scanner in2= new Scanner(System.in);
		int answer2= in2.nextInt();
		
		while( (sum1 <  21)  ) {
			if( answer1==1 ) {
				player1 = (int) (Math.random() * 11);
				if (player1==0) {
					player1 = (int) (Math.random() * 11);
				}
				sum1 = sum1 + player1;
				System.out.println("The next card`s value for player1 is " + player1 + " do you want to continue, press 1-YES, 0-No");
				System.out.println("Suma actuala este: " + sum1);
			}
			answer1=in.nextInt();
			if(answer1==0) break;
			if ( sum1 == 21 ) {
				 System.out.println("Player1 wins");
				 break;
			 }
			if ( sum1 >= 21 ) {
				 System.out.println("Player2 wins");
				 break;
			 }
		} 
		while( (sum2<21) && (sum1<21)) {
			 if( answer2==1 ) {
					player2 = (int) (Math.random() * 11);
					if (player2==0) {
						player2 = (int) (Math.random() * 11);
					}
					sum2 = sum2 + player2;
					System.out.println("The next card`s value for player2 is " + player2 + " do you want to continue, press 1-YES, 0-No");
					System.out.println("Suma actuala este: " + sum2);
				}
			 answer2=in.nextInt();
			 if(answer2==0) break;			
			 if ( sum2 == 21 ) {
				 System.out.println("Player2 wins");
			 }
			 if ( sum2 >= 21 ) {
				 System.out.println("Player1 wins");
			 }
		}
		
		if ( (sum1 > sum2) && (sum1<=21)) {
			System.out.println("Player 1 wins!");
		}
		else if ( (sum1 < sum2) && (sum2<=21)) {
			System.out.println("Player 2 wins!");
		}
		else if( sum1==sum2){
			System.out.println("The both players win!");
		}
		else  if(sum1>=21) {
			System.out.println("player 2 wins");
		}
		else if ( sum2>=21){
			System.out.println("player 1 wins");
		}
	}
}

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		FootballMatch fm = new FootballMatch("BM" , "CJ");
		Random r1 = new Random();
		
		for(int i = 0; i < fm.FULL_TIME; i++){
			
			int tmp = r1.nextInt(2);
			
			switch(tmp){
					
			case 0 : fm.homeTeamScored();break;
			case 1 : fm.awayTeamScored();break;
			default : System.out.println("invalid number");
					
			}
		}
		
                s = fm.getMatchScore();
		System.out.println("scorul:" + s );
	}

}

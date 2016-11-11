
public class FootballMatch implements FootballMatch_I {

	private String homeTeamName;
	private String awayTeamName;
	private int homeTeamScore;
	private int awayTeamScore;
	
	public FootballMatch( String homeTeamName, String awayTeamName){
		setHomeTeamName(homeTeamName) ;
		 setAwayTeamName(awayTeamName);
	}
	public void homeTeamScored(){
		homeTeamScore++ ;
	}
	
	public void awayTeamScored(){
		awayTeamScore++ ;
	}
	
	 public String getMatchScore(){
		return homeTeamName + String.valueOf(homeTeamScore) + "|" + awayTeamName + String.valueOf(awayTeamScore);
		
	 }
	@Override
	public String getHomeTeamName() {
		// TODO Auto-generated method stub
		return this.homeTeamName;
	}
	@Override
	public void setHomeTeamName(String homeTeamName) {
		// TODO Auto-generated method stub
		this.homeTeamName = homeTeamName;
	}
	@Override
	public String getAwayTeamName() {
		// TODO Auto-generated method stub
		return this.awayTeamName;
	}
	@Override
	public void setAwayTeamName(String awayTeamName) {
		// TODO Auto-generated method stub
		this.awayTeamName = awayTeamName;
		
	}
}

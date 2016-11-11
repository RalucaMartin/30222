
public interface FootballMatch_I extends SportsMatch_I{
	
	public static final int HALF_TIME = 45;
	public static final int FULL_TIME = 40;
	
	public void homeTeamScored();
	
	public void awayTeamScored();
	
	public String getMatchScore();
	

}

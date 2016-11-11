package models.animals;

public class Stork extends Bird{
	private enum StorkType{
		ciconia, wood, marabou
	}
	
	private StorkType storkType;
	
	public StorkType getStorkType(){
		return this.storkType;
	}
	
	public void setStorkType(StorkType storkType){
		this.storkType = storkType;
	}
	
	public Stork (String name, boolean migrates, Integer avgFlightAltitude){
		setName(name);
		setNrOfLegs(2);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		
	}
	
	public Stork(){
		this("Stork", true, 20);
	}
}

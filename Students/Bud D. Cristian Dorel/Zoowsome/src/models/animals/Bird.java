package models.animals;

public class Bird extends Animal{
	private boolean migrates;
	private Integer avgFlightAltitude;
	
	public boolean getMigrates(){
		return this.migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public Integer getAvgFlightAltitude(){
		return this.avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
}

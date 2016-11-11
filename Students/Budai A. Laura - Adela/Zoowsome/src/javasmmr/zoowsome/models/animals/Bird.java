package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	boolean migrates;
	Integer avgFlightAltitude;

	public boolean getMigrates() {
		return this.migrates;	
	}
	
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;	
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}

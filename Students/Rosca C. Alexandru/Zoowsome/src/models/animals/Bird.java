package models.animals;

public abstract class Bird extends Animal{
	
	protected boolean migrate;
	protected int avgFlightAltitude;
	
	public Bird(double maintenaceCost1, double dangerPerc1){
		super(maintenaceCost1, dangerPerc1);
	}
	
	public boolean isMigrate() {
		return migrate;
	}
	public void setMigrate(boolean migrate) {
		this.migrate = migrate;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	

}

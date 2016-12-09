package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	public Bird(Double maintenanceCost,Double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}
	public boolean migrates;
	public int avgFlightAltitude;
	public boolean isMigrates() {
		return migrates;
	}
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}

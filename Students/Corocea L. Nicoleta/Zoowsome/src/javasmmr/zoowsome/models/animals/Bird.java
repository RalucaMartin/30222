package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	boolean migrates;
	int avgFlightAltitude;

	public Bird(double maintenanceCost, double dangPerc, boolean migrates, int avgFlightAltitude) {
		super(maintenanceCost, dangPerc);
		this.avgFlightAltitude = avgFlightAltitude;
		this.migrates = migrates;
		// TODO Auto-generated constructor stub
	}

}

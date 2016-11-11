package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	public Penguin() {
		super();
		this.setNrOfLegs(2);
		this.setName("Penguin");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
	}
}

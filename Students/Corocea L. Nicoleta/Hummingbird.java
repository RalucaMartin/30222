package javasmmr.zoowsome.models.animals;

public class Hummingbird extends Bird {
	public Hummingbird(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setName(name);
		this.avgFlightAltitude = avgFlightAltitude;
		this.setNrOfLegs(nrOfLegs);
		this.migrates = migrates;

	}

	public Hummingbird() {
		this.setName("Hummingbird");
		this.avgFlightAltitude = 15;
		this.migrates = false;
		this.setNrOfLegs(2);

	}
}

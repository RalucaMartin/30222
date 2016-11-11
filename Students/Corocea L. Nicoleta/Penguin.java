package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	public Penguin(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setName(name);
		this.avgFlightAltitude = avgFlightAltitude;
		this.setNrOfLegs(nrOfLegs);
		this.migrates = migrates;

	}

	public Penguin() {
		this.setName("Pingu");
		this.avgFlightAltitude = 0;
		this.migrates = false;
		this.setNrOfLegs(2);

	}
}

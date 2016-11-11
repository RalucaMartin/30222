package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setName(name);
		this.avgFlightAltitude = avgFlightAltitude;
		this.setNrOfLegs(nrOfLegs);
		this.migrates = migrates;

	}

	public Parrot() {
		this.setName("Parrot");
		this.avgFlightAltitude = 20;
		this.migrates = false;
		this.setNrOfLegs(2);

	}
}

package javasmmr.zoowsome.models.animals;

public class Vulture extends Bird {
	public Vulture(int nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Vulture() {
		this(2, "PlesuvVulture", true, 7000);
	}
}

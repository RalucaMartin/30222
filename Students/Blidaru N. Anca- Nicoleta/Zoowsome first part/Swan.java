package javasmmr.zoowsome.models.animals;

public class Swan extends Bird {
	public Swan(int nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Swan() {
		this(2, "Swan", true, 500);
	}
}

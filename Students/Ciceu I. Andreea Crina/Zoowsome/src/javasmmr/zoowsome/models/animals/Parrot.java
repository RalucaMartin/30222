package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Parrot() {
		this(2, "Papagal", false, 10);
	}
}

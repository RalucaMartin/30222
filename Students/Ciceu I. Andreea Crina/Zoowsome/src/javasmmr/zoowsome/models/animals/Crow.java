package javasmmr.zoowsome.models.animals;

public class Crow extends Bird {
	public Crow(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Crow() {
		this(2, "Cioara", true, 100);
	}

}

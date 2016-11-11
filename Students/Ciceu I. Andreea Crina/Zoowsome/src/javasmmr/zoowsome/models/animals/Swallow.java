package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird {
	
	public Swallow(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Swallow() {
		this(2, "Randunica", true, 100);
	}
}

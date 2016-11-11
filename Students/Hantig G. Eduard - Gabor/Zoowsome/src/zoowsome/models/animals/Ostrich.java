package zoowsome.models.animals;

public class Ostrich extends Bird {

	public Ostrich() {
		setNrOfLegs(2);
		setName("Ostrich");
		super.setMigrates(false);
		super.setAvgFlightAltitude(0);
	}
	
	public Ostrich(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setMigrates(migrates);
		super.setAvgFlightAltitude(avgFlightAltitude);
	}
}
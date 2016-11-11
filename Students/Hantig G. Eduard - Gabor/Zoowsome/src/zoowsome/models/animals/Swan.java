package zoowsome.models.animals;

public class Swan extends Bird {

	public Swan() {
		setNrOfLegs(2);
		setName("Swan");
		super.setMigrates(false);
		super.setAvgFlightAltitude(9);
	}
	
	public Swan(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setMigrates(migrates);
		super.setAvgFlightAltitude(avgFlightAltitude);
	}
}
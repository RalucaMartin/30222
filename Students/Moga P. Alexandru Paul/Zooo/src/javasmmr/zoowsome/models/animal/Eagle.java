package javasmmr.zoowsome.models.animal;

public class Eagle extends Bird {

	public Eagle() {
		this("Eagle",2,false,1594);
	}

	public Eagle(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		super(0.1, 0.2);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
	
}

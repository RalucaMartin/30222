package javasmmr.zoowsome.models.animal;

public class Flamingo extends Bird {

	public Flamingo() {
		this("Flamingo",2,false,500);
	}

	public Flamingo(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
	
}

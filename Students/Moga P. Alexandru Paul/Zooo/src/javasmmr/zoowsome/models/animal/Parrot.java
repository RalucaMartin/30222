package javasmmr.zoowsome.models.animal;

public class Parrot extends Bird{

	public Parrot() {
		this("Parrot",2,false,500);
	}

	public Parrot(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		super(0.1, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
	

}

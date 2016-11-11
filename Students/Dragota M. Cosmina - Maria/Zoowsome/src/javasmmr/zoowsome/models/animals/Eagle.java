package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{

	public Eagle(int noOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		
	}
	
	public Eagle(){
		this(2, "Vultur", false, 450);
	}

}

package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	public Eagle(){
		this("Eagle",2,300,true);
	}
	public Eagle(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates){
		super(0.2,0.5);
		setName(name);
		setNrOfLegs(4);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}
}

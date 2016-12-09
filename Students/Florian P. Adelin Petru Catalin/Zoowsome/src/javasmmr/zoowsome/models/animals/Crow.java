package javasmmr.zoowsome.models.animals;

public class Crow extends Bird {
	public Crow(){
		this("Crow",2,300,true);
	}
	public Crow(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates){
		super(0.2,0.5);
		setName(name);
		setNrOfLegs(4);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}
}

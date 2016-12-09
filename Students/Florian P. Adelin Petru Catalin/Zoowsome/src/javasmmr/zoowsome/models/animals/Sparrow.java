package javasmmr.zoowsome.models.animals;

public class Sparrow extends Bird {
	public Sparrow(){
		this("Sparrow",2,300,true);
	}
	public Sparrow(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates){
		super(0.2,0.5);
		setName(name);
		setNrOfLegs(4);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}
}

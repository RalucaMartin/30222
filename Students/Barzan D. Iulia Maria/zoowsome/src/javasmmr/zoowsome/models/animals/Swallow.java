package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird {
	public Swallow ( Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude ) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setMigrates ( migrates ) ;
		setAvgFlightAltitude (avgFlightAltitude ) ;
	}
	
	public Swallow (){
		this ( 2, "White Swallow", true, 15 );
	}

}

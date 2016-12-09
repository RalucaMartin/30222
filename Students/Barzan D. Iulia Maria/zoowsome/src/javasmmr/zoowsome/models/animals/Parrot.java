package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot ( Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude ) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setMigrates ( migrates ) ;
		setAvgFlightAltitude (avgFlightAltitude ) ;
	}
	
	public Parrot (){
		this ( 2, "Cacadu", false, 7 );
	}

}

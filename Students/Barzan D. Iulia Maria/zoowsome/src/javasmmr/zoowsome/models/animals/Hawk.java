
package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {
	public Hawk ( Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude ) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setMigrates ( migrates ) ;
		setAvgFlightAltitude (avgFlightAltitude ) ;
	}
	
	public Hawk (){
		this ( 2, "Goshawk", false, 30 );
	}

}
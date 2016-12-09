package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile ( Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setLaysEggs ( laysEggs ) ;
	}
	
	public Crocodile (){
		this ( 4, "American crocodile", true );
	}

}
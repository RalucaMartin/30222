package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon ( Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setLaysEggs ( laysEggs ) ;
	}
	
	public Chameleon (){
		this ( 4, "Furcifer", true );
	}

}

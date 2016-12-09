package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach ( Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setCanFly ( canFly ) ;
		setIsDangerous ( isDangerous ) ;
	}
	
	public Cockroach (){
		this ( 4, "Blaberoidea", true, false );
	}

}

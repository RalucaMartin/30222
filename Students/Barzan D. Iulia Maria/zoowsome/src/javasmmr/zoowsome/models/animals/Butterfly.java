package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly ( Integer nrOfLegs, String name, boolean canFly, boolean isDangerous){
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setCanFly ( canFly ) ;
		setIsDangerous ( isDangerous ) ;
	}
	
	public Butterfly (){
		this ( 0, "Anna Blue", true,false ) ;
	}

}

package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider ( Integer nrOfLegs, String name, boolean canFly, boolean isDangerous ){
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setCanFly ( canFly ) ;
		setIsDangerous ( isDangerous ) ;
	}
	
	public Spider (){
		this ( 8, "Lycosidae", true, false ) ;
	}

}

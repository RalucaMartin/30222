package javasmmr.zoowsome.models.animals;


public class Monkey extends Mammal{
	public Monkey (Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setNormalBodyTemp ( normalBodyTemp ) ;
		setPercBodyHair ( percBodyHair ) ;
	}
	
	public Monkey () {
		this (4, "Gorilla", 35, 85) ;
	}

}
